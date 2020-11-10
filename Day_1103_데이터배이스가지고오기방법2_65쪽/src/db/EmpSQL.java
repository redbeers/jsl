package db;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import dao.DBManager;
import vo.EmpVO;

public class EmpSQL {
	
	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	Statement stmt = null;	// 재활용 x 다시 선언해야 사용가능
	ResultSet rs = null;
	PreparedStatement pstmt = null;//재활용가능
	
	public List<EmpVO> exam_01(int aa) {

		String pstmtquery ="select ename, salary, salary+?  from employee";
		List<EmpVO> list = new ArrayList<>();//리턴용
		EmpVO emp = null;

		try {	
			//pstmt
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(pstmtquery);
			pstmt.setInt(1, aa);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString(1));
				emp.setSalary(rs.getInt(2));
				emp.setSum(rs.getInt(3));
				
				
				list.add(emp);
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
		return list;
	}
	
	public List<EmpVO> exam_02(int a) {
		String query = "select ename, salary, salary*12+? as salary2 from employee order by salary2 desc";
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, a);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("Salary"));
				emp.setSum(rs.getInt("salary2"));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_03(int a) {
		String query = "select ename, salary\r\n" + 
				"from employee\r\n" + 
				"where salary>?\r\n" + 
				"order by salary desc";
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, a);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("Salary"));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_04(int a) {
		String query = "select ename, dno from employee where eno=?";
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, a);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setDno(rs.getInt("dno"));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public List<EmpVO> exam_05(long a,long b) {
		String query = "select ename,salary\r\n" + 
				"from employee\r\n" + 
				"where salary not between ? and ?";
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setLong(1, a);
			pstmt.setLong(2, b);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_06(String a, String b) {
		String query = "select ename, job,hiredate\r\n" + 
				"from employee\r\n" + 
				"where hiredate between ? and ?";
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getDate("hiredate"));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public List<EmpVO> exam_07(int a, int b) {
		String query = "select ename, dno from employee where dno in (?,?) order by ename";
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		
			conn = manager.getConnection();
			try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, a);
			pstmt.setInt(2, b);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setDno(rs.getInt("dno"));
				
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_08(int a, int b) {
		String query = "select ename, salary, dno from employee where salary between 2000 and 3000 and dno in(?, ?)\r\n" + 
				"order by ename";
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		
			conn = manager.getConnection();
			try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, a);
			pstmt.setInt(2, b);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDno(rs.getInt("dno"));
				
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_09(String x) {
		String query = "select ename, hiredate from employee where hiredate like ?";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, x + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getDate("hiredate"));

				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_10(String a) {
		String query = "select ename, job from employee where manager is " +a;
		List<EmpVO> list = new ArrayList<EmpVO>(); // 리턴용
		EmpVO emp = null;
		
			
			try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, a);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_11() {
		String query = "select ename, salary, commission from employee where "
				+ "commission is not null order by salary, commission";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission(rs.getInt("commission"));
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_12() {
		String query = "select ename from employee where ename like '__R%'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_13() {
		String query = "select ename from employee where ename like '%A%' and ename like '%E%'";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_14() {
		String query = "select ename, job, salary\r\n" + 
				"from employee\r\n" + 
				"where job in('CLERK','SALESMAN') \r\n" + 
				"and salary not in(1600,950,1300)";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<EmpVO> exam_15(int a) {
		String query = "select ename, salary, commission from employee where commission >=?";
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO emp = null;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,a);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getInt("salary"));
				emp.setCommission(rs.getInt("commission"));
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
