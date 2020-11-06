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
	public EmpDTO exam_01() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select max(salary) as \"Max\",min(salary) as \"Min\","
				+ "sum(salary) as \"Sum\",round(avg(salary))as \"Ave\""
				+ "from employee ";
		EmpDTO emp = new EmpDTO();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				emp.setMin(rs.getInt(1));
				emp.setMin(rs.getInt(2));
				emp.setSum(rs.getInt(3));
				emp.setRound(rs.getInt(4));
				
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
		return emp;
	}
	public List<EmpDTO> exam_02() {
		List<EmpDTO> list = new ArrayList();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select job as \"job\", max(salary) as \"Max\""
				+ ",min(salary) as \"Min\",sum(salary) as \"Sum\""
				+ ",round(avg(salary)) as \"Round\" "
				+ "from employee group by job";
		
		try {
		
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				EmpDTO emp = new EmpDTO();
				emp.setJob(rs.getString(1));
				emp.setMax(rs.getInt(2));
				emp.setMin(rs.getInt(3));
				emp.setSum(rs.getInt(4));
				emp.setRound(rs.getInt(5));
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
