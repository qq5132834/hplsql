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
	  String sql = " CREATE PROCEDURE P_PROCEDUER(IN input STRING, OUT output STRING)	"
	  					+ " BEGIN "
	  					+ " SET result = 'hello,';	"
	  					+ " PRINT result || ' ' || input; "
	  					+ " END; " 
				+ " PRINT " 
				+ " CALL P_PROCEDUER('sics');" ;
	  
	  //查询语句
	  sql = "select id, name,age from userinfos";
	  
	  
//	  args = new String[]{"-version"};  //查看版本
	  args = new String[]{"-e", sql };  
    
	  System.exit(new Exec().run(args));
	  
  }
}
