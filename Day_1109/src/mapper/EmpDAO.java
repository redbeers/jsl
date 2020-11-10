package mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import UTR.DBUtil;
import domain.EmpDTO;

public class EmpDAO {
	private EmpDAO() {}
	private static EmpDAO instance = new EmpDAO();
	
	public static EmpDAO getInstance() {
		return instance;
	}
	
	public List<EmpDTO> exam_01(int a) {
		List<EmpDTO> list = new ArrayList();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select ename,job\r\n" + 
				"from employee\r\n" + 
				"where job = (select job\r\n" + 
				"from employee\r\n" + 
				"where eno=?)";
		
		EmpDTO emp = new EmpDTO();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, a);
			rs = pstmt.executeQuery();			
			
			while(rs.next()) {
				
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
					
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