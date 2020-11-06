package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DBUtil;
import vo.EmpVO;

public class EmpDAO {
	private EmpDAO() {
	}

	private static EmpDAO instance = new EmpDAO();

	public static EmpDAO gatInstance() {
		return instance;
	}

	// 메소드 정의
	public  List<EmpVO> exam_01(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//1.리턴변수 또는 객체정의
		List<EmpVO> list = new ArrayList<>();
		//2.query문
		
		String sql="select SUBSTR(HIREDATE,1,2) as stype, SUBSTR(HIREDATE,4,2) as stype2 from employee";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.executeQuery();
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setStype(rs.getString("stype"));
				vo.setStype2(rs.getString("stype2"));
				list.add(vo);
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