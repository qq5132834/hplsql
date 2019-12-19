package sics.seiois.res.plsql;

public class TestHpsqlParser {

    public static void main(String[] args) throws Exception {
        String sql = "DECLARE\n" +
                "--定义与hr.employees表中的这几个列相同的记录数据类型\n" +
                "   TYPE RECORD_TYPE_EMPLOYEES IS RECORD(\n" +
                "        f_name   hr.employees.first_name%TYPE,\n" +
                "        h_date   hr.employees.hire_date%TYPE,\n" +
                "        j_id     hr.employees.job_id%TYPE);\n" +
                "--声明一个该记录数据类型的记录变量\n" +
                "   v_emp_record RECORD_TYPE_EMPLOYEES;\n" +
                " \n" +
                "BEGIN\n" +
                "   SELECT first_name, hire_date, job_id INTO v_emp_record\n" +
                "   FROM employees\n" +
                "   WHERE employee_id = &emp_id;\n" +
                " \n" +
                "   DBMS_OUTPUT.PUT_LINE('雇员名称：'||v_emp_record.f_name\n" +
                "             ||'  雇佣日期：'||v_emp_record.h_date\n" +
                "             ||'  岗位：'||v_emp_record.j_id);\n" +
                "END;";

        System.out.println(sql);
    }
}
