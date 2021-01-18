package sics.seiois.res.plsql;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ExecTest {

    public static void main(String[] args) throws  Exception {
        new POD().run();
    }

    public static class POD extends PlsqlBaseVisitor<Integer>{

        Exec exec = new Exec();

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

        public void run() throws Exception{
            String execString = "PRINT coalesce(NULL,1,NULL,NULL);";
            InputStream input = null;
            if (execString != null) {
                input = new ByteArrayInputStream(execString.getBytes("UTF-8"));
            }
            PlsqlLexer lexer = new PlsqlLexer(new ANTLRInputStream(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PlsqlParser parser = new PlsqlParser(tokens);
            ParseTree tree = parser.program();
            System.out.println(tree.toStringTree());
            Integer i = visit(tree);
            System.out.println(i);
            System.out.println("over!");
        }

    }

}
