/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sics.seiois.res.plsql;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Expressions
 */
public class Expression {

  Exec exec;
  boolean trace = false; 
  
  Expression(Exec e) {
    exec = e;  
    trace = exec.getTrace();
  }
  
  /**
   * Evaluate an expression
   */
  public void exec(PlsqlParser.ExprContext ctx) {
    try {
      if (ctx.T_ADD() != null) {
        operatorAdd(ctx); 
      }
      else if (ctx.T_SUB() != null) {
        operatorSub(ctx); 
      }
      else if (ctx.T_MUL() != null) {
        operatorMultiply(ctx); 
      }
      else if (ctx.T_DIV() != null) {
        operatorDiv(ctx); 
      }
      else if (ctx.interval_item() != null) {
        createInterval(ctx);
      }
      else {
        visitChildren(ctx);
      }
    }
    catch (Exception e) {
      exec.signal(e);
    }
  }
  
  /**
   * Evaluate an expression in executable SQL statement
   */
  public void execSql(PlsqlParser.ExprContext ctx) {
    StringBuilder sql = new StringBuilder();
    if (ctx.T_OPEN_P() != null) {
      sql.append("(");
      if (ctx.select_stmt() != null) {
        exec.append(sql, evalPop(ctx.select_stmt()).toString(), ctx.T_OPEN_P().getSymbol(), ctx.select_stmt().getStart());
        exec.append(sql, ctx.T_CLOSE_P().getText(), ctx.select_stmt().stop, ctx.T_CLOSE_P().getSymbol()); 
      }
      else {
        sql.append(evalPop(ctx.expr(0)).toString());
        sql.append(")");
      }
    }
    else if (ctx.T_MUL() != null) {
      sql.append(evalPop(ctx.expr(0)).toString());
      sql.append(" * ");
      sql.append(evalPop(ctx.expr(1)).toString());
    }
    else if (ctx.T_DIV() != null) {
      sql.append(evalPop(ctx.expr(0)).toString());
      sql.append(" / ");
      sql.append(evalPop(ctx.expr(1)).toString());
    }
    else if (ctx.T_ADD() != null) {
      sql.append(evalPop(ctx.expr(0)).toString());
      sql.append(" + ");
      sql.append(evalPop(ctx.expr(1)).toString());
    }
    else if (ctx.T_SUB() != null) {
      sql.append(evalPop(ctx.expr(0)).toString());
      sql.append(" - ");
      sql.append(evalPop(ctx.expr(1)).toString());
    }
    else if (ctx.interval_item() != null) {
      sql.append(exec.getFormattedText(ctx));
    }
    else {
      visitChildren(ctx);
      sql.append(exec.stackPop().toString());
    }
    exec.stackPush(sql);
  }
  
  /**
   * Evaluate a boolean expression
   */
  public void execBool(PlsqlParser.Bool_exprContext ctx) {
    if (ctx.bool_expr_atom() != null) {
      eval(ctx.bool_expr_atom());
      return;
    }
    Var result = evalPop(ctx.bool_expr(0));
    if (ctx.T_OPEN_P() != null) {
      if (ctx.T_NOT() != null) {
        result.negate();
      }
    }
    else if (ctx.bool_expr_logical_operator() != null) {
      if (ctx.bool_expr_logical_operator().T_AND() != null) {
        if (result.isTrue()) {
          result = evalPop(ctx.bool_expr(1));
        }
      }
      else if (ctx.bool_expr_logical_operator().T_OR() != null) {
        if (!result.isTrue()) {
          result = evalPop(ctx.bool_expr(1));
        }
      }
    }
    exec.stackPush(result);
  }
  
  /**
   * Evaluate a boolean expression in executable SQL statement
   */
  public void execBoolSql(PlsqlParser.Bool_exprContext ctx) {
    StringBuilder sql = new StringBuilder();
    if (ctx.T_OPEN_P() != null) {
      sql.append("(");
      sql.append(evalPop(ctx.bool_expr(0)).toString());
      sql.append(")");
    }
    else if (ctx.bool_expr_atom() != null) {
      sql.append(evalPop(ctx.bool_expr_atom()).toString());
    }
    else if (ctx.bool_expr_logical_operator() != null) {
      sql.append(evalPop(ctx.bool_expr(0)).toString());
      sql.append(" " + ctx.bool_expr_logical_operator().getText() + " ");
      sql.append(evalPop(ctx.bool_expr(1)).toString());
    }
    exec.stackPush(sql);
  }
  
  /**
   * Binary boolean expression
   */
  public Integer execBoolBinary(PlsqlParser.Bool_expr_binaryContext ctx) {
    PlsqlParser.Bool_expr_binary_operatorContext op = ctx.bool_expr_binary_operator();
    if (op.T_EQUAL() != null || op.T_EQUAL2() != null) {
      operatorEqual(ctx, true); 
    }
    else if (op.T_NOTEQUAL() != null || op.T_NOTEQUAL2() != null) {
      operatorEqual(ctx, false); 
    }
    else if (op.T_GREATER() != null || op.T_LESS() != null || op.T_GREATEREQUAL() != null || op.T_LESSEQUAL() != null) {
      operatorCompare(ctx, op);
    }
    else {
      exec.stackPush(false);
    }
    return 0; 
  }
  
  /**
   * Binary boolean expression in executable SQL statement
   */
  public Integer execBoolBinarySql(PlsqlParser.Bool_expr_binaryContext ctx) {
    StringBuilder sql = new StringBuilder();
    sql.append(evalPop(ctx.expr(0)).toString());
    sql.append(" " + exec.getFormattedText(ctx.bool_expr_binary_operator()) + " ");
    sql.append(evalPop(ctx.expr(1)).toString());
    exec.stackPush(sql);
    return 0; 
  }
  
  /**
   * Unary boolean expression
   */
  public Integer execBoolUnary(PlsqlParser.Bool_expr_unaryContext ctx) {
    boolean val = false;
    if (ctx.T_IS() != null) {
      val = evalPop(ctx.expr(0)).isNull();
      if (ctx.T_NOT() != null) {
        val = !val;
      }
    }
    else if (ctx.T_BETWEEN() != null) {
      Var v = evalPop(ctx.expr(0));
      Var v1 = evalPop(ctx.expr(1));
      int cmp = v.compareTo(v1);
      if (cmp >= 0) {
        Var v2 = evalPop(ctx.expr(2));
        cmp = v.compareTo(v2);
        if (cmp <= 0) {
          val = true;
        }
      }
    }
    exec.stackPush(val);
    return 0; 
  }
  
  /**
   * Unary boolean expression in executable SQL statement
   */
  public Integer execBoolUnarySql(PlsqlParser.Bool_expr_unaryContext ctx) {
    StringBuilder sql = new StringBuilder();
    if (ctx.T_IS() != null) {
      sql.append(evalPop(ctx.expr(0)).toString());
      sql.append(" " + exec.getText(ctx, ctx.T_IS().getSymbol(), ctx.T_NULL().getSymbol()));
    }    
    else if (ctx.T_BETWEEN() != null) {
      sql.append(evalPop(ctx.expr(0)).toString());
      sql.append(" " + ctx.T_BETWEEN().getText() + " ");
      sql.append(evalPop(ctx.expr(1)).toString());
      sql.append(" " + ctx.T_AND().getText() + " ");
      sql.append(evalPop(ctx.expr(2)).toString());
    }
    else if (ctx.T_EXISTS() != null) {
      exec.append(sql, exec.nvl(ctx.T_NOT(), ctx.T_EXISTS()), ctx.T_OPEN_P());
      exec.append(sql, evalPop(ctx.select_stmt()).toString(), ctx.T_OPEN_P().getSymbol(), ctx.select_stmt().getStart());
      exec.append(sql, ctx.T_CLOSE_P().getText(), ctx.select_stmt().stop, ctx.T_CLOSE_P().getSymbol());
    }
    else if (ctx.bool_expr_single_in() != null) {
      singleInClauseSql(ctx.bool_expr_single_in(), sql);
    }
    else if (ctx.bool_expr_multi_in() != null) {
      multiInClauseSql(ctx.bool_expr_multi_in(), sql);
    }
    exec.stackPush(sql);
    return 0; 
  }
  
  /**
   * Single value IN clause in executable SQL statement
   */
  public void singleInClauseSql(PlsqlParser.Bool_expr_single_inContext ctx, StringBuilder sql) {
    sql.append(evalPop(ctx.expr(0)).toString() + " ");
    exec.append(sql, exec.nvl(ctx.T_NOT(), ctx.T_IN()), ctx.T_OPEN_P());
    if (ctx.select_stmt() != null) {
      exec.append(sql, evalPop(ctx.select_stmt()).toString(), ctx.T_OPEN_P().getSymbol(), ctx.select_stmt().getStart());
      exec.append(sql, ctx.T_CLOSE_P().getText(), ctx.select_stmt().stop, ctx.T_CLOSE_P().getSymbol());
    }
    else {
      int cnt = ctx.expr().size();
      for (int i = 1; i < cnt; i++) {
        sql.append(evalPop(ctx.expr(i)).toString());
        if (i + 1 < cnt) {
          sql.append(", ");
        }
      }
      sql.append(")");
    }    
  }
  
  /**
   * Multi-value IN clause in executable SQL statement
   */
  public void multiInClauseSql(PlsqlParser.Bool_expr_multi_inContext ctx, StringBuilder sql) {
    int cnt = ctx.expr().size();
    sql.append("(");
    for (int i = 0; i < cnt; i++) {
      sql.append(evalPop(ctx.expr(i)).toString());
      if (i + 1 < cnt) {
        sql.append(", ");
      }
    }
    sql.append(")");
    if (ctx.T_NOT() != null) {
      sql.append(" " + ctx.T_NOT().getText());
    }
    sql.append(" " + ctx.T_IN().getText() + " (");
    if (ctx.select_stmt() != null) {
      sql.append(evalPop(ctx.select_stmt()));
    }
    sql.append(")");
  }
  
  /**
   * Cursor attribute %ISOPEN, %FOUND and %NOTFOUND
   */
  public void execCursorAttribute(PlsqlParser.Expr_cursor_attributeContext ctx) {
    String name = ctx.ident().getText();
    Var val = new Var(Var.Type.BOOL);
    Var cursor = exec.findCursor(name);
    if (cursor != null) {
      Query query = (Query)cursor.value;
      if (query != null) {
        if (ctx.T_ISOPEN() != null) {
          val.setValue(query.isOpen());
        }
        else if (ctx.T_FOUND() != null) {
          val.setValue(query.isFound());
        }
        else if (ctx.T_NOTFOUND() != null) {
          val.setValue(query.isNotFound());
        }
      }
      exec.stackPush(val);
    }
    else {
      trace(ctx, "Cursor not found: " + name);
      exec.signal(Signal.Type.SQLEXCEPTION);
    }
  }
  
  /**
   * Addition operator
   */
  public void operatorAdd(PlsqlParser.ExprContext ctx) {
    Var v1 = evalPop(ctx.expr(0));
    Var v2 = evalPop(ctx.expr(1));
    if (v1.value == null || v2.value == null) {
      evalNull();
    }
    else if (v1.type == Var.Type.BIGINT && v2.type == Var.Type.BIGINT) {
      exec.stackPush(new Var((Long)v1.value + (Long)v2.value)); 
    }
    else if (v1.type == Var.Type.BIGINT && v2.type == Var.Type.DATE) {
      exec.stackPush(changeDateByInt((Date)v2.value, (Long)v1.value, true /*add*/));
    }
    else if (v1.type == Var.Type.DATE && v2.type == Var.Type.BIGINT) {
      exec.stackPush(changeDateByInt((Date)v1.value, (Long)v2.value, true /*add*/));
    }
    else if (v1.type == Var.Type.STRING && v2.type == Var.Type.STRING) {
      exec.stackPush(((String)v1.value) + ((String)v2.value));
    }
    else if (v1.type == Var.Type.DATE && v2.type == Var.Type.INTERVAL) {
      exec.stackPush(new Var(((Interval)v2.value).dateChange((Date)v1.value, true /*add*/)));
    }
    else if (v1.type == Var.Type.TIMESTAMP && v2.type == Var.Type.INTERVAL) {
      exec.stackPush(new Var(((Interval)v2.value).timestampChange((Timestamp)v1.value, true /*add*/), v1.scale));
    }
    else {
      evalNull();
    }
  }

  /**
   * Subtraction operator
   */
  public void operatorSub(PlsqlParser.ExprContext ctx) {
    Var v1 = evalPop(ctx.expr(0));
    Var v2 = evalPop(ctx.expr(1));
    if (v1.value == null || v2.value == null) {
      evalNull();
    }
    else if (v1.type == Var.Type.BIGINT && v2.type == Var.Type.BIGINT) {
      exec.stackPush(new Var((Long)v1.value - (Long)v2.value)); 
    }
    else if (v1.type == Var.Type.DATE && v2.type == Var.Type.BIGINT) {
      exec.stackPush(changeDateByInt((Date)v1.value, (Long)v2.value, false /*subtract*/));
    }
    else if (v1.type == Var.Type.DATE && v2.type == Var.Type.INTERVAL) {
      exec.stackPush(new Var(((Interval)v2.value).dateChange((Date)v1.value, false /*subtract*/)));
    }
    else if (v1.type == Var.Type.TIMESTAMP && v2.type == Var.Type.INTERVAL) {
      exec.stackPush(new Var(((Interval)v2.value).timestampChange((Timestamp)v1.value, false /*subtract*/), v1.scale));
    }
    else {
      evalNull();
    }
  }
  
  /**
   * Multiplication operator
   */
  public void operatorMultiply(PlsqlParser.ExprContext ctx) {
    Var v1 = evalPop(ctx.expr(0));
    Var v2 = evalPop(ctx.expr(1));
    if (v1.value == null || v2.value == null) {
      evalNull();
    }
    else if (v1.type == Var.Type.BIGINT && v2.type == Var.Type.BIGINT) {
      exec.stackPush(new Var((Long)v1.value * (Long)v2.value)); 
    }
    else {
      exec.signal(Signal.Type.UNSUPPORTED_OPERATION, "Unsupported data types in multiplication operator");
    }
  }
  
  /**
   * Division operator
   */
  public void operatorDiv(PlsqlParser.ExprContext ctx) {
    Var v1 = evalPop(ctx.expr(0));
    Var v2 = evalPop(ctx.expr(1));
    if (v1.value == null || v2.value == null) {
      evalNull();
    }
    else if (v1.type == Var.Type.BIGINT && v2.type == Var.Type.BIGINT) {
      exec.stackPush(new Var((Long)v1.value / (Long)v2.value)); 
    }
    else {
      exec.signal(Signal.Type.UNSUPPORTED_OPERATION, "Unsupported data types in division operator");
    }
  }
  
  /**
   * Add or subtract the specified number of days from DATE
   */
  public Var changeDateByInt(Date d, Long i, boolean add) {
    Calendar c = Calendar.getInstance();
    c.setTimeInMillis(d.getTime());
    int days = i.intValue();
    if(!add) {
      days *= -1;
    }
    c.add(Calendar.DAY_OF_MONTH, days);
    return new Var(new Date(c.getTimeInMillis()));
  }
    
  /**
   * Equality operator
   */
  public void operatorEqual(PlsqlParser.Bool_expr_binaryContext ctx, boolean equal) {
    Var v1 = evalPop(ctx.expr(0));
    Var v2 = evalPop(ctx.expr(1));
    boolean eq = v1.equals(v2);
    if (!equal) {
      eq = !eq;
    }
    exec.stackPush(eq);
  }

  /**
   * Comparison operator
   */
  public void operatorCompare(PlsqlParser.Bool_expr_binaryContext ctx, PlsqlParser.Bool_expr_binary_operatorContext op) {
    Var v1 = evalPop(ctx.expr(0));
    Var v2 = evalPop(ctx.expr(1));
    int cmp = v1.compareTo(v2);
    boolean bool = false;
    if (op.T_GREATER() != null) {
      if (cmp > 0) {
        bool = true;
      }
    }
    else if (op.T_GREATEREQUAL() != null) {
      if (cmp >= 0) {
        bool = true;
      }
    }
    if (op.T_LESS() != null) {
      if (cmp < 0) {
        bool = true;
      }
    }
    else if (op.T_LESSEQUAL() != null) {
      if (cmp <= 0) {
        bool = true;
      }
    }
    exec.stackPush(bool);
  }
  
  /**
   * String concatenation operator
   */
  public void operatorConcat(PlsqlParser.Expr_concatContext ctx) {
    StringBuilder val = new StringBuilder();
    int cnt = ctx.expr_concat_item().size();
    boolean nulls = true;
    for (int i = 0; i < cnt; i++) {
      Var c = evalPop(ctx.expr_concat_item(i));
      if (!c.isNull()) {
        val.append(c.toString());
        nulls = false;
      }
    }
    if (nulls) {
      evalNull();
    }
    else {
      evalString(val);
    }
  }
  
  /**
   * String concatenation operator in executable SQL statement
   */
  public void operatorConcatSql(PlsqlParser.Expr_concatContext ctx) {
    StringBuilder sql = new StringBuilder();
    sql.append("CONCAT(");
    int cnt = ctx.expr_concat_item().size();
    for (int i = 0; i < cnt; i++) {
      sql.append(evalPop(ctx.expr_concat_item(i)).toString());
      if (i + 1 < cnt) {
        sql.append(", ");
      }
    }
    sql.append(")");
    exec.stackPush(sql);
  }
  
  /**
   * Simple CASE expression
   */
  public void execSimpleCase(PlsqlParser.Expr_case_simpleContext ctx) {
    int i = 1;
    int cnt = ctx.expr().size();
    boolean found = false;
    Var val = evalPop(ctx.expr(0));
    while(i < cnt) {
      Var when = evalPop(ctx.expr(i));
      if(val.compareTo(when) == 0) {
        visit(ctx.expr(i + 1));
        found = true;
        break;
      }
      i += 2;
    }
    if(!found) {
      if(ctx.T_ELSE() != null) {
        visit(ctx.expr(cnt - 1));
      }
      else {
        evalNull();
      }
    }
  }
  
  /**
   * Simple CASE expression in executable SQL statement
   */
  public void execSimpleCaseSql(PlsqlParser.Expr_case_simpleContext ctx) {
    StringBuilder sql = new StringBuilder();
    sql.append("CASE ");
    sql.append(evalPop(ctx.expr(0)).toString());
    int cnt = ctx.T_WHEN().size();
    for (int i = 0; i < cnt; i++) {
      sql.append(" WHEN ");
      sql.append(evalPop(ctx.expr(i * 2 + 1)).toString());
      sql.append(" THEN ");
      sql.append(evalPop(ctx.expr(i * 2 + 2)).toString());
    }
    if (ctx.T_ELSE() != null) {
      sql.append(" ELSE ");
      sql.append(evalPop(ctx.expr(cnt * 2 + 1)).toString());
    }
    sql.append(" END");
    exec.stackPush(sql);
  }
  
  /**
   * Searched CASE expression
   */
  public void execSearchedCase(PlsqlParser.Expr_case_searchedContext ctx) {
    int cnt = ctx.bool_expr().size();
    boolean found = false;
    for(int i = 0; i < cnt; i++) {
      if(evalPop(ctx.bool_expr(i)).isTrue()) {
        visit(ctx.expr(i)); 
        found = true;
        break;
      }
    }
    if(!found) {
      if(ctx.T_ELSE() != null) {
        visit(ctx.expr(cnt));
      }
      else {
        evalNull();
      }
    }
  }
  
  /**
   * Searched CASE expression in executable SQL statement
   */
  public void execSearchedCaseSql(PlsqlParser.Expr_case_searchedContext ctx) {
    StringBuilder sql = new StringBuilder();
    sql.append("CASE");
    int cnt = ctx.T_WHEN().size();
    for (int i = 0; i < cnt; i++) {
      sql.append(" WHEN ");
      sql.append(evalPop(ctx.bool_expr(i)).toString());
      sql.append(" THEN ");
      sql.append(evalPop(ctx.expr(i)).toString());
    }
    if (ctx.T_ELSE() != null) {
      sql.append(" ELSE ");
      sql.append(evalPop(ctx.expr(cnt)).toString());
    }
    sql.append(" END");
    exec.stackPush(sql);
  }
  
  /**
   * Create an interval variable
   */
  public void createInterval(PlsqlParser.ExprContext ctx) {
    int num = evalPop(ctx.expr(0)).intValue();
    Interval interval = new Interval().set(num, ctx.interval_item().getText());
    exec.stackPush(new Var(interval));
  }
  
  /**
   * Evaluate the expression and push the value to the stack
   */
  void eval(ParserRuleContext ctx) {
    visit(ctx);
  }
      
  /**
   * Evaluate the expression and pop value from the stack
   */
  Var evalPop(ParserRuleContext ctx) {
    visit(ctx);
    if (!exec.stack.isEmpty()) { 
      return exec.stackPop();
    }
    return Var.Empty;
  }
  
  /**
   * Evaluate the expression to specified String value
   */
  void evalString(String string) {
    exec.stackPush(new Var(string)); 
  }
  
  void evalString(StringBuilder string) {
    evalString(string.toString()); 
  }
  
  /**
   * Evaluate the expression to NULL
   */
  void evalNull() {
    exec.stackPush(Var.Null); 
  }
  
  /**
   * Execute rules
   */
  Integer visit(ParserRuleContext ctx) {
    return exec.visit(ctx);  
  } 
  
  /**
   * Execute children rules
   */
  Integer visitChildren(ParserRuleContext ctx) {
    return exec.visitChildren(ctx);  
  }  
  
  /**
   * Trace information
   */
  public void trace(ParserRuleContext ctx, String message) {
    exec.trace(ctx, message);
  }
}
