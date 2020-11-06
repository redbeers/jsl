package db_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DBManager;

public class Exam_01 {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	Statement stmt = null;	// 재활용 x 다시 선언해야 사용가능
	ResultSet rs = null;
	
	PreparedStatement pstmt = null;
	
	public void exam_011(int ss) {

		String pstmtquery ="select ename, salary, salary+? from employee";
		try {	
			//pstmt
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(pstmtquery);
			pstmt.setInt(1, ss);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.println(rs.getInt("salary")+ss);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}