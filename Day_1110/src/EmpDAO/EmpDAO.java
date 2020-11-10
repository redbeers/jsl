package EmpDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import EmpVO.EmpVO;
import UTR.DBUtil;

public class EmpDAO {
	private EmpDAO() {}
	private static EmpDAO instance = new EmpDAO();
	public static EmpDAO getInstance() {
		return instance;
	}
	public void exam_01() {
		Connection conn =null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql ="create table emp_insert as select * fromm employee where 1=0";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {}
		}
	}
	public int exam_02(int dno, String ename, String job, int manager) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into emp_insert values(eno, ename, job, manager, hiredate)values(?,?,?,?, sysdate)";
		
		int row=0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, manager);
			
			row = pstmt.executeUpdate(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {}
		}
		return row;
	}
	public int exam_02_1(EmpVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into emp_insert values(eno, ename, job, manager, hiredate)values(?,?,?,?, sysdate)";
		
		int row=0;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEno());
			pstmt.setString(2, vo.getEname());
			pstmt.setString(3, vo.getJob());
			pstmt.setInt(4, vo.getManager());
			
			row = pstmt.executeUpdate(); 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {}
		}
		return row;
	}
}
