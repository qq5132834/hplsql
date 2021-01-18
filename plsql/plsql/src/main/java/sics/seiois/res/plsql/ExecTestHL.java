package sics.seiois.res.plsql;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import sics.seiois.res.plsql.PlsqlParser.Correct_stmtContext;
import sics.seiois.res.plsql.PlsqlParser.ProgramContext;

public class ExecTestHL extends PlsqlBaseVisitor<Integer>{
	
	@Override
	public Integer visitCorrect_stmt(Correct_stmtContext ctx) {
		System.out.println("hello correct!");
//		return super.visitCorrect_stmt(ctx);
		return 0;
	}

	public static void main(String[] args) throws Exception {
		
		ExecTestHL exec = new ExecTestHL();
		
		String execString = "PRINT coalesce(NULL,1,NULL,NULL);";
		execString = " on auto_ei_entity_hl005(name,  addr ) as t  where t.row_id != 0 correct t.addr='xixi', t.name=(1+2); ";
        InputStream input = null;
        if (execString != null) {
            input = new ByteArrayInputStream(execString.getBytes("UTF-8"));
        }
        PlsqlLexer lexer = new PlsqlLexer(new ANTLRInputStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlsqlParser parser = new PlsqlParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(tree.getClass().getName());
//        ProgramContext programContext = (ProgramContext)tree;
        System.out.println(tree.toStringTree());
        Integer i = exec.visit(tree);
//        Integer i = programContext.accept(exec);
        System.out.println("i:" + i);
        System.out.println("OVER!");
	}

}
