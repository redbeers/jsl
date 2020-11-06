package view;

import java.sql.Connection;
import java.sql.SQLException;

import db.DBUtil;

public class DBTest {

	public static void main(String[] args) {
		Connection conn = DBUtil.getConnection();
		
		System.out.println("aaa"+conn);
		
		try {
			conn.close();
			
		}catch(SQLException e) {
			
		}catch(Exception e) {
			
		}
	}

}
