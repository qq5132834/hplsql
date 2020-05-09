package sics.seiois.res.plsql;

import java.util.Stack;

public class Correct {

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
        System.out.println("hello correct.");
        return 1;
    }


}
