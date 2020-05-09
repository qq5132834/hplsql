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

public class Plsql {
  public static void main(String[] args) throws Exception {
	  
	  //存储过程
	  
	   String sql = " select id, name,age from userinfo where id = 1; ";
//	  String sql = " on table(c1, c2, c3) as t  where t.c1=1 and t.c2=2 correct t.c1=3; ";
	  
	  
	//	  args = new String[]{"-version"};  //查看版本
	  args = new String[]{"-e", sql };
    
//	  args = new String[]{ "-f", "src/test/queries/local/dimension.sql" };
	  
	  System.exit(new Exec().run(args));
	  
  }
  
  /***
   * 数据库函数调用
   * @return
   */
  public static String func(){
	  String sql2  = " CREATE PROCEDURE P_PROCEDUER() "
				+ " BEGIN "
				+ " EXECUTE 'select ADDN(4,19)' "
				+ " END; "
		  		+ " CALL P_PROCEDUER() ";
	  return sql2;
  }
  
  /***
   * 创表和插入数据
   * @return
   */
  public static String createTableAndInsert(){
		 String sql1 = " CREATE PROCEDURE P_PROCEDUER() "
					+ " BEGIN "
//					+ " EXECUTE IMMEDIATE 'create table account_user( "
//					+   "       userno varchar(255), "
//					+   "       username varchar(255), "
//					+   "       balance varchar(255) "
//					+   " )' "
					+   " EXECUTE 'INSERT INTO account_user VALUES(10, 10, 10)' "
//					+   " insert into account_user(userno,username,balance) values('2','支票','100') "
					+   " commit; "
					+   " EXCEPTION "
					+ 	" WHEN OTHERS THEN "
					+   " ROLLBACK; "
					+ 	" END; "
			  		+ " CALL P_PROCEDUER() ";
		 return sql1;
  }
  
  /***
   * hello 规则
   * @return
   */
  public static String helloWrold(){
	  String sql = " CREATE PROCEDURE P_PROCEDUER(IN input STRING, OUT output STRING)	"
				+ " BEGIN "
				+ " select name from userinfos where id = 3 "
				+ " update userinfos set age=98 where id = 1 "
				+ " update userinfos set age=97 where id = 2 "
				+ " SET result = 'hello,';	"
				+ " PRINT result || ' ' || input; "
				+ " END; " 
		+ " PRINT " 
		+ " CALL P_PROCEDUER('world .');" ;
	  return sql;
  }
  
}
