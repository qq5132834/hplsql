package sics.seiois.res.plsql;

import com.facebook.presto.jdbc.PrestoConnection;
import com.facebook.presto.jdbc.PrestoResultSet;
import com.facebook.presto.jdbc.PrestoStatement;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;


public class AppMainMysql {
	
	public static void main(String[] args) {
		
		connect();
		
	}
	
	private static void connect(){
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
		try {
			Class.forName("com.facebook.presto.jdbc.PrestoDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		PrestoConnection connection = null;
		try {

			connection = (PrestoConnection) DriverManager.getConnection("jdbc:presto://192.168.152.121:8081/ei/public","root",null);
//			connection = (PrestoConnection) DriverManager.getConnection("jdbc:presto://192.168.133.128:8183/mysql/baseinfo","mysql",null);
//			connection = (PrestoConnection) DriverManager.getConnection("jdbc:presto://127.0.0.1:8080/mysql/baseinfo","root",null);

			PrestoStatement stmt = (PrestoStatement) connection.createStatement();

			// select * from userinfos;
			PrestoResultSet rs = null;
			rs = (PrestoResultSet) stmt.executeQuery("show tables");  //select count(*) from lineitem   show tables
//
//			while (rs.next()) {
//				System.out.println(rs.getString(1));
//			}
//			rs.close();

			rs = (PrestoResultSet) stmt.executeQuery("select id, name,age from userinfo");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"/"+rs.getString(2)+"/"+rs.getInt(3));
			}
			rs.close();
			connection.close();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
