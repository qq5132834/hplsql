package sics.seiois.res.plsql;

import com.facebook.presto.jdbc.PrestoConnection;
import com.facebook.presto.jdbc.PrestoResultSet;
import com.facebook.presto.jdbc.PrestoStatement;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang.StringUtils;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;

public class Correct {

    static final String IDENTIFY = " ";
    boolean isPrintln = true;
    StringBuilder selectSql;
    StringBuilder updateSql;
    String obatin;
    ArrayList<Expr> correctExprList = new ArrayList<>();
    ArrayList<Col> selectColumnList = new ArrayList<>();
    ArrayList<Col> whereColumnList = new ArrayList<>();
    //
    Exec exec = null;
    Stack<Var> stack = null;
    Conf conf;
    Meta meta;

    boolean trace = false;

    Correct(Exec e) {
        exec = e;
        stack = exec.getStack();
        conf = exec.getConf();
        meta = exec.getMeta();
        trace = exec.getTrace();
    }

    /**
     * SQL CORRECT statement
     */
    public Integer correct(PlsqlParser.Correct_stmtContext ctx){

        println("hello correct.");

        if(ctx.correct_update_assignment()!=null) {
            this.getCorrectExpr(ctx.correct_update_assignment());
        }

        String on = ctx.T_ON().getText();
        println("T_ON:" + on);
        if(StringUtils.isNotBlank(on)){
            selectSql = new StringBuilder();
            selectSql.append("SELECT"); selectSql.append(IDENTIFY);
        }

        exec.stmtConnList.clear();
        trace(ctx, "ON");

        boolean oldBuildSql = exec.buildSql;
        exec.buildSql = true;

        if(ctx.correct_stmt_cols()!=null){
            getCorrectCol(ctx.correct_stmt_cols());
        }

        addSelectColumn(selectSql);
//        println(selectSql.toString());

        String tableName = this.evalPop(ctx.table_name()).toString();
        println("table_name:" + tableName);
        if(StringUtils.isNotBlank(tableName)){
            selectSql.append("FROM");  selectSql.append(IDENTIFY);
            selectSql.append(tableName);  selectSql.append(IDENTIFY);
        }

        String tableNameAlias = null;
        if(ctx.from_alias_clause()!=null){
            tableNameAlias = evalPop(ctx.from_alias_clause()).toString();
            selectSql.append(tableNameAlias);
            selectSql.append(IDENTIFY);
        }

        if(ctx.where_clause()!=null){
            selectSql.append(evalPop(ctx.where_clause()).toString());
            selectSql.append(IDENTIFY);
        }

        String conn = exec.getStatementConnection();

        println(">>>>>>>>>>>>>>>>>>>selectSql.start<<<<<<<<<<<<<<<<");
        println("selectSql:" + selectSql.toString());
        println(">>>>>>>>>>>>>>>>>>>selectSql.end<<<<<<<<<<<<<<<<<<");

        Query query = exec.executeQuery(ctx, selectSql.toString(), conn);
        if (query.error()) {
            exec.signal(query);
            return 1;
        }
        exec.setSqlSuccess();
        ResultSet rs = query.getResultSet();
        ResultSetMetaData rm = null;
        if (rs != null) {
            try{
                rm = rs.getMetaData();
                while (rs.next()) {
                    for (int i = 1; i <= correctExprList.size(); i++){
                        println(rs.getString(i));
                        correctExprList.get(i-1).setVal(rs.getString(i));
                    }
                    ArrayList<Col> kv = (ArrayList<Col>)selectColumnList.clone();
                    for (int i = correctExprList.size() + 1; i <= this.getColumnsCounts(); i++) {
                        if (i > correctExprList.size() + 1) {
                            System.out.print("\t");
                        }
                        System.out.print(rs.getString(i));
                        kv.get(i-correctExprList.size()-1).setVal(rs.getString(i)); //save one line data
                    }
                    System.out.println("");
                    exec.incRowCount();

                    for (Col c : kv) {
                        println(c.getColumnName() + "=" + c.getVal()); //print one line data
                    }

                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        try{
            List<String> sqlList = new ArrayList<>();
            sqlList.add("obtain (1+5)");
            sqlList.add("obtain coalesce(NULL,1,NULL,NULL);");
            sqlList.add("obtain fvalue(1,2,10,5,5);");
            sqlList.add("obtain coalesce(fvalue(1,2,10,5,5),101);");
            for (String ssql: sqlList) {
                String[] args = new String[]{"-e", ssql};
                Exec exec = new Exec();
                exec.run(args);
                String s = exec.correct.obatin;
                println("res:" + s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }


        return 1;
    }

    void select_mm_f_relation(List<Col> list) {
        Map<String, String> map = new HashMap<>();
        for (Col col : list) {
            map.put(col.getColumnName(),col.getVal());
        }
        String rowId = map.get("row_id");
        //TODO 调用MM查询接口

    }

    void addSelectColumn(StringBuilder sb){
        for(Expr expr : correctExprList){
            sb.append(" ");
            sb.append(expr.getExpr());
            sb.append(" ");
            sb.append("AS");
            sb.append(" ");
            sb.append(expr.getAliasName());
            sb.append(", ");
        }
        int i = 1;
        for(Col col : selectColumnList){
            sb.append(col.getColumnName());
            if(i<selectColumnList.size()){
                sb.append(", ");
            }
            else {
                sb.append(" ");
            }
            i++;
        }
    }

    int getColumnsCounts(){
        return correctExprList.size() + selectColumnList.size();
    }



    //获取where_caluse中的查询条件
//    void getCorrectWhereCol(PlsqlParser.Where_clauseContext ctx){
//        String where = ctx.T_WHERE().toString();
//        if(StringUtils.isNotBlank(where)){
//            List<PlsqlParser.ExprContext> exprContextList = ctx.bool_expr().bool_expr_atom().bool_expr_binary().expr();
//            if(exprContextList !=null && exprContextList.size() > 0){
//                for (PlsqlParser.ExprContext exprContext : exprContextList) {
//                    List<TerminalNode> terminalNodeList = exprContext.expr_atom().ident().L_ID();
//                    if(terminalNodeList !=null && terminalNodeList.size()>0 ){
////                        terminalNodeList.get(terminalNodeList.size()-1)
//                    }
//                }
//            }
//        }
//    }

    //correct expr
    void getCorrectExpr(PlsqlParser.Correct_update_assignmentContext ctx){
        String correct = ctx.T_CORRECT().toString();
        if(StringUtils.isNotBlank(correct)){
            List<PlsqlParser.Assignment_stmt_itemContext> assignment_stmt_itemContext_list = ctx.update_assignment().assignment_stmt_item();
            if(assignment_stmt_itemContext_list != null && assignment_stmt_itemContext_list.size() > 0){
                int i = 0;
                for (PlsqlParser.Assignment_stmt_itemContext assignment_stmt_itemContext : assignment_stmt_itemContext_list) {
                    PlsqlParser.Assignment_stmt_single_itemContext assignment_stmt_single_itemContext = assignment_stmt_itemContext.assignment_stmt_single_item();
                    List<TerminalNode> terminalNodes = assignment_stmt_single_itemContext.ident().L_ID();
                    if(terminalNodes!=null && terminalNodes.size()>0){
                        TerminalNode col_terminalNode = terminalNodes.get(terminalNodes.size()-1);
                        String col_name = col_terminalNode.getText();
                        String expr = exec.getFormattedText(assignment_stmt_single_itemContext.expr());
                        Expr expr1 = new Expr();
                        expr1.setAliasName(col_name+"_" + i++);
                        expr1.setColumnName(col_name);
                        expr1.setExpr(expr);
                        correctExprList.add(expr1);
                    }
                }
            }
        }
    }

    //select col
    void getCorrectCol(PlsqlParser.Correct_stmt_colsContext ctx){
        if(ctx.select_list()!=null){
            List<PlsqlParser.Select_list_itemContext>  select_list_itemContextList = ctx.select_list().select_list_item();
            if(select_list_itemContextList != null && select_list_itemContextList.size() > 0){
                boolean isExistRowId = false;
                boolean isSourceDataId = false;
                for (PlsqlParser.Select_list_itemContext select_list_itemContext : select_list_itemContextList) {
                    List<TerminalNode> terminalNodeList = select_list_itemContext.expr().expr_atom().ident().L_ID();
                    if(terminalNodeList !=null && terminalNodeList.size()>0 ){
                        String columnName = terminalNodeList.get(terminalNodeList.size()-1).getText();
                        Col col = new Col();
                        col.setColumnName(columnName);
                        selectColumnList.add(col);
                        if("row_id".toUpperCase().equals(columnName.toUpperCase())){
                            isExistRowId = true;
                        }
                        if("source_data_id".toUpperCase().equals(columnName.toUpperCase())){
                            isSourceDataId = true;
                        }
                    }
                }
                if(!isExistRowId){
                    Col col = new Col();
                    col.setColumnName("row_id");
                    selectColumnList.add(col);
                }
                if(!isSourceDataId){
                    Col col = new Col();
                    col.setColumnName("source_data_id");
                    selectColumnList.add(col);
                }
            }
        }
    }


    void connect(String selectSql){

        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        try {
            Class.forName("com.facebook.presto.jdbc.PrestoDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        PrestoConnection connection = null;
        try {
            connection = (PrestoConnection) DriverManager.getConnection("jdbc:presto://192.168.152.121:8081/ei/public","root",null);
            PrestoStatement stmt = (PrestoStatement) connection.createStatement();
            PrestoResultSet rs = null;
            rs = (PrestoResultSet) stmt.executeQuery(selectSql);
            while (rs.next()) {
                System.out.println(rs.getString(1)+"/"+rs.getString(2)+"/"+rs.getString(3));
            }
            rs.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void println(String str){
        if(isPrintln){
            System.out.println(str);
        }
    }

    /**
     * Evaluate the expression and pop value from the stack
     */
    Var evalPop(ParserRuleContext ctx) {
        exec.visit(ctx);
        if (!exec.stack.isEmpty()) {
            return exec.stackPop();
        }
        return Var.Empty;
    }

    /**
     * trace information
     * 追踪信息
     */
    void trace(ParserRuleContext ctx, String message) {
        exec.trace(ctx, message);
    }

    void trace(ParserRuleContext ctx, Var var, ResultSet rs, ResultSetMetaData rm, int idx) throws SQLException {
        exec.trace(ctx, var, rs, rm, idx);
    }

    /**
     * OBTAIN Statement
     */
    public Integer obatin(PlsqlParser.Obtain_stmtContext ctx) {
        trace(ctx, "OBATIN");
        if (ctx.expr() != null) {
            obatin = evalPop(ctx.expr()).toString();
        }
        return 0;
    }


    private static class Col{
        private String columnName;
        private String val;
        public String getColumnName() {
            return columnName;
        }
        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }
        public String getVal() {
            return val;
        }
        public void setVal(String val) {
            this.val = val;
        }
    }

    private static class Expr extends Col{
        private String aliasName;
        private String expr;

        public String getAliasName() {
            return aliasName;
        }
        public void setAliasName(String aliasName) {
            this.aliasName = aliasName;
        }
        public String getExpr() {
            return expr;
        }
        public void setExpr(String expr) {
            this.expr = expr;
        }
    }

}
