package mapper;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import UTR.DBUtil;
import domain.EmpDTO;

//씽글톤
public class EmpDAO {
	private EmpDAO() {}
	private static EmpDAO instance = new EmpDAO();
	
	public static EmpDAO getInstance() {
		return instance;
	}
	
	public List<EmpDTO> exam_01(String a) {
		List<EmpDTO> list = new ArrayList();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select e.ename, e.dno, d.dname\r\n" + 
				"from employee e, department d\r\n" + 
				"where e.dno=d.dno\r\n" + 
				"and e.ename= ?";
		
		EmpDTO emp = new EmpDTO();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			rs = pstmt.executeQuery();			
			
			while(rs.next()) {
				
				emp.setEname(rs.getString("ename"));
				emp.setDno(rs.getInt("dno"));
				emp.setDanme(rs.getString("dname"));
				
				list.add(emp);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if (pstmt != null) rs.close();
				if (conn != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public List<EmpDTO> exam_03(int a) {
		List<EmpDTO> list = new ArrayList();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select dno, job, loc\r\n" + 
				"from employee inner join department\r\n" + 
				"using(dno)\r\n" + 
				"where dno=?";
		
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a);
			rs = pstmt.executeQuery();			
				
			while(rs.next()) {
				EmpDTO emp = new EmpDTO();	
				emp.setDno(rs.getInt("dno"));
				emp.setJob(rs.getString("job"));
				emp.setLoc(rs.getString("loc"));
				
				list.add(emp);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if (pstmt != null) rs.close();
				if (conn != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
