package jdbc;

import java.sql.*;

public class OracleSQL extends OracleConn{
	Statement stmt = null;
	ResultSet rs = null;
	
//	public void exam01() throws Exception{
//		String query = "select ename, salary, salary*12 as sum from employee";
//		stmt = myConn.createStatement();
//		rs = stmt.executeQuery(query);
//		
//		System.out.println("이름\t급여\t연봉");
//		while(rs.next()) {
//			System.out.print(rs.getString("ename")+"\t");
//			System.out.print(rs.getInt("salary")+"\t");
//			System.out.print(rs.getInt("sum")+"\t");
//			System.out.println();
//		}
//	}
	public void exam02 ()throws Exception{
	String query = "select ename, salary, job, dno, nvl(commission,0) from employee";
	stmt = myConn.createStatement();
	rs = stmt.executeQuery(query);
	
	System.out.println("이름\t급여\t직업\t부서\t연봉");
	while(rs.next()) {
		System.out.print(rs.getString("ename")+"\t");
		System.out.print(rs.getInt("salary")+"\t");
		System.out.print(rs.getString("job")+"\t");
		System.out.print(rs.getInt("dno")+"\t");
		System.out.print(rs.getInt("commission")+"\t");
		System.out.println();
		}
	}
	public void cleanUp()throws Exception{
		rs.close();
		stmt.close();
	}

}
