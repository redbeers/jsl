package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class OracleConn {
	private String myDriver="oracle.jdbc.driver.OracleDriver";
	private String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private String myID = "jslhrd46";
	private String myPass = "asdf";
	
	protected Connection myConn;
	
	public OracleConn() {}
	public void makeConn()throws Exception{
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL,myID,myPass);
	}
	public abstract void cleanUp() throws Exception;
	
	public void takeDown() throws Exception{
		cleanUp();
		myConn.close();
	}
}
