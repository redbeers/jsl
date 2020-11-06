package sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import db.DBManager;

public class EmpSQL {
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	Statement stmt = null;//일회성이다.
	PreparedStatement pstmt = null;//여러번사용
	ResultSet rs = null;
	
	
	public void exam_01(int salary) {
//		String query = "select * from employee where salary>="+salary;
		String pstmtquery="select * from employee where salary>=?  ";//입력값에 ?를 넣는다.
		try {
//			conn = manager.getConnection();
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(query);
			//pstmt
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(pstmtquery);
			pstmt.setInt(1, salary);
//			pstmt.setInt(2, salary);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.println(rs.getInt("salary")+"\t");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	//이름이 SCOTT인사람찾기
	public void exam_02(String name,int eno) {
//		String query = "select * from employee where ename='"+name+"'";
		String pstmtquery="select * from employee where ename>=? and eno=? ";//입력값에 ?를 넣는다.
		try {
//			conn = manager.getConnection();
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(query);
			
			//pstmt
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(pstmtquery);
			pstmt.setString(1, name);
			pstmt.setInt(2, eno);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.println(rs.getInt("salary")+"\t");
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
	//부서번호가 10 이고 직급이 MANAFER 검색
	public void exam_03(int dno, String job1) {
		String query = "select * from employee where dno="+dno+"or job='"+job1+"'";
		try {
			conn = manager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.print(rs.getInt("dno")+"\t");
				System.out.println(rs.getString("job")+"\t");
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
	
	//이름에 F로 시작
	//이름에 A 포함
	public void exam_05(String name) {
		String query = "select * from employee where ename like'"+name+"%'";
		String pstmtquery="select * from employee where ename like ?";//입력값에 ?를 넣는다.
		try {
//			conn = manager.getConnection();
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(query);
			//pstmt
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(pstmtquery);
			pstmt.setString(1, name+"%");
//			pstmt.setString(2, name);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.println(rs.getInt("salary")+"\t");
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
