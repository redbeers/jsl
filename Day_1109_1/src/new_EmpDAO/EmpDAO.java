package new_EmpDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import new_UTR.DBUtil;

public class EmpDAO {
	private EmpDAO() {}
	private static EmpDAO instance = new EmpDAO();
	
	public static EmpDAO getInstance() {
		return instance;
	}
	
	public void createExam() {
		Connection conn = null;
//		PreparedStatement pstmt=null;
		Statement stmt = null;
		String sql = "create table dept("
				+ "dno number(2),"
				+ "dname varchar2(14),"
				+ "loc varchar2(13))";
		
		//커넥션 연결
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			}catch(Exception e) {}
		
	}
}
