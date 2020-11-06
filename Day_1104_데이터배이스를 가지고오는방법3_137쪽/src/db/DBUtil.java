package db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getConnection() {
		Connection conn=null;//리터타입
		String myDriver="oracle.jdbc.driver.OracleDriver";
		String myURL="jdbc:oracle:thin:@localhost:1521:";
		String myID="jslhrd46";
		String myPass="asdf";
		
		try{
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myURL,myID,myPass);
		}catch(Exception e) {
			System.out.println("emfkdlqj Ehsms ");
			e.printStackTrace();
		}
		return conn;
	}
	}
	
