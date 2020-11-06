package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private DBManager() {}

	private static DBManager instance = new DBManager();

	public static DBManager getInstance() {

		return instance;
	}
	public Connection getConnection() {
		Connection myConn=null;
		String myDriver="oracle.jdbc.driver.OracleDriver";
		String myURL="jdbc:oracle:thin:@localhost:1521:";
		String myID="jslhrd46";
		String myPass="asdf";
		
		try{
			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL,myID,myPass);
		}catch(Exception e) {
			System.out.println("emfkdlqj Ehsms ");
			e.printStackTrace();
		}
		return myConn;
	}
}
