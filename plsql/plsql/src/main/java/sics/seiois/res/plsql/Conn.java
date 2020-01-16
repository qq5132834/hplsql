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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.TimeZone;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import com.facebook.presto.jdbc.PrestoConnection;
import com.facebook.presto.jdbc.PrestoResultSet;
import com.facebook.presto.jdbc.PrestoStatement;

public class Conn {
 
  public enum Type {DB2, HIVE, MYSQL, TERADATA};
  
  HashMap<String, Stack<Connection>> connections = new HashMap<String, Stack<Connection>>();
  HashMap<String, String> connStrings = new HashMap<String, String>();
  HashMap<String, Type> connTypes = new HashMap<String, Type>();
  
  HashMap<String, ArrayList<String>> connInits = new HashMap<String, ArrayList<String>>();
  HashMap<String, ArrayList<String>> preSql = new HashMap<String, ArrayList<String>>();
  
  Exec exec;
  Timer timer = new Timer();
  boolean trace = false;  
  boolean info = false;
  
  Conn(Exec e) {
    exec = e;  
    trace = exec.getTrace();
    info = exec.getInfo();
  }
  
  /**
   * Execute a SQL query
   */
  public Query executeQuery(Query query, String connName) {
    try {
      Connection conn = getConnection(connName);
      runPreSql(connName, conn);
      Statement stmt = conn.createStatement();
      exec.info(null, "Starting query");
      timer.start();
      ResultSet rs = stmt.executeQuery(query.sql);
      timer.stop();
      query.set(conn, stmt, rs);      
      if (info) {
        exec.info(null, "Query executed successfully (" + timer.format() + ")");
      }      
    } catch (Exception e) {
      query.setError(e);
    }
    return query;
  }
  
  public Query executeQuery(String sql, String connName) {
    return executeQuery(new Query(sql), connName);
  }
  
  /**
   * Prepare a SQL query
   */
  public Query prepareQuery(Query query, String connName) {
    try {
      Connection conn = getConnection(connName);
      timer.start();
      PreparedStatement stmt = conn.prepareStatement(query.sql);
      timer.stop();
      query.set(conn, stmt);      
      if (info) {
        exec.info(null, "Prepared statement executed successfully (" + timer.format() + ")");
      }      
    } catch (Exception e) {
      query.setError(e);
    }
    return query;
  }
  
  /**
   * Execute a SQL statement
   */
  public Query executeSql(String sql, String connName) {
    Query query = new Query(sql);
    try {
      Connection conn = getConnection(connName);
      runPreSql(connName, conn);
      Statement stmt = conn.createStatement();
      ResultSet rs = null;
      exec.info(null, "Starting SQL statement");
      timer.start();
      if (stmt.execute(sql)) {
        rs = stmt.getResultSet();        
      } 
      timer.stop();
      query.set(conn, stmt, rs);
      if (info) {
        exec.info(null, "SQL statement executed successfully (" + timer.format() + ")");
      } 
    } catch (Exception e) {
      query.setError(e);
    }
    return query;
  }
  
  /**
   * Close the query object
   */
  public void closeQuery(Query query, String connName) {
    query.closeStatement(); 
    returnConnection(connName, query.getConnection());
  }
  
  /**
   * Run pre-SQL statements 
   * @throws SQLException 
   */
  void runPreSql(String connName, Connection conn) throws SQLException {
    ArrayList<String> sqls = preSql.get(connName);  
    if (sqls != null) {
      Statement s = conn.createStatement();
      for (String sql : sqls) {
        exec.info(null, "Starting pre-SQL statement");
        s.execute(sql);
      }
      s.close();
      preSql.remove(connName);
    }
  }
  
  /** 
   * Get a connection
   * @throws Exception 
   */
  synchronized Connection getConnection(String connName) throws Exception {
    Stack<Connection> connStack = connections.get(connName);
    String connStr = connStrings.get(connName);
    if (connStr == null) {
      throw new Exception("Unknown connection profile: " + connName);
    }
    if (connStack != null && !connStack.empty()) {        // Reuse an existing connection
      return connStack.pop();
    }
    Connection c = openConnection(connStr);
    ArrayList<String> sqls = connInits.get(connName);     // Run initialization statements on the connection
    if (sqls != null) {
      Statement s = c.createStatement();
      for (String sql : sqls) {
        s.execute(sql);
      }
      s.close();
    }
    return c;
  }
  
//  Connection getConnection(){
//	  TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
//		try {
//			Class.forName("com.facebook.presto.jdbc.PrestoDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		PrestoConnection connection = null;
//		try {
//
//			System.out.println(Conn.class.getName()+"，路径.");
//			connection = (PrestoConnection) DriverManager.getConnection("jdbc:presto://192.168.152.171:8090/mysql/baseinfo","root",null);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	  return connection;
//  }
  
//  Connection getConnection(){
////	  TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//		Connection connection = null;
//		try {
//
//			System.out.println(Conn.class.getName()+"，路径.");
//			connection =  DriverManager.getConnection("jdbc:mysql://192.168.133.128:33306/baseinfo","root","123456");
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	  return connection;
//  }
  
  Connection getConnection(){
	  TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		try {

			System.out.println("\n"+Conn.class.getName()+"，路径.");
			connection = DriverManager.getConnection("jdbc:postgresql://192.168.152.171:5432/postgres","postgres","123456");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	  return connection;
  }
  
  
  /**
   * Open a new connection
   * @throws Exception 
   */
  Connection openConnection(String connStr) throws Exception {
	  
	  Connection connection = this.getConnection();
	  if(connection!=null){
		  System.out.println("connection is not null.");
		  return connection;
	  }
	  
    String driver = "org.apache.hadoop.hive.jdbc.HiveDriver";
    StringBuilder url = new StringBuilder();
    String usr = "";
    String pwd = "";
    if (connStr != null) {
      String[] c = connStr.split(";");
      if (c.length >= 1) {
        driver = c[0];
      }
      if (c.length >= 2) {
        url.append(c[1]);
      }
      else {
        url.append("jdbc:hive://");
      }
      for (int i = 2; i < c.length; i++) {
        if (c[i].contains("=")) {
          url.append(";");
          url.append(c[i]);          
        }
        else if (usr.isEmpty()) {
          usr = c[i];
        }
        else if (pwd.isEmpty()) {
          pwd = c[i];
        }
      }
    }
    Class.forName(driver);
    timer.start();
    Connection conn = DriverManager.getConnection(url.toString().trim(), usr, pwd);
    timer.stop();
    if (info) {
      exec.info(null, "Open connection: " + url + " (" + timer.format() + ")");
    }
    return conn;
  }
  
  /**
   * Get the database type by profile name
   */
  Conn.Type getTypeByProfile(String name) {
    return connTypes.get(name);
  }
  
  /**
   * Get the database type by connection string
   */
  Conn.Type getType(String connStr) {
    if (connStr.contains("hive.")) {
      return Type.HIVE;
    }
    else if (connStr.contains("db2.")) {
      return Type.DB2;
    }
    else if (connStr.contains("mysql.")) {
      return Type.MYSQL;
    }
    else if (connStr.contains("teradata.")) {
      return Type.TERADATA;
    }
    return Type.HIVE;
  }
  
  /**
   * Return the connection to the pool
   */
  void returnConnection(String name, Connection conn) {
    if (conn != null) {
      connections.get(name).push(conn);
    }
  }
  
  /**
   * Add a new connection string
   */
  public void addConnection(String name, String connStr) {
    connections.put(name, new Stack<Connection>());
    connStrings.put(name, connStr);
    connTypes.put(name, getType(connStr));
  }
  
  /**
   * Add initialization statements for the specified connection
   */
  public void addConnectionInit(String name, String connInit) {
    ArrayList<String> a = new ArrayList<String>(); 
    String[] sa = connInit.split(";");
    for (String s : sa) {
      s = s.trim();
      if (!s.isEmpty()) {
        a.add(s);
      }
    }    
    connInits.put(name, a);
  }
  
  /**
   * Add SQL statements to be executed before executing the next SQL statement (pre-SQL)
   */
  public void addPreSql(String name, ArrayList<String> sql) {
    preSql.put(name, sql); 
  }
}
