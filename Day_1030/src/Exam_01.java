/* JDBC Programming
 * 1.드라이버 로딩 Clacc.forName()
 * 2.커넥션 DriverManager.getConnection()
 * 3.명령문 처리 Statement(일회성 한번만사용가능), PreparedStatement(반복사용가능)
 * 4.쿼리 exxecuteQuery()
 * 
 */
import java.sql.*;
public class Exam_01 {

	
	public static void main(String[] args) {

		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myId = "jslhrd46";
		String myPw = "asdf";
		Connection conn = null; // 기본적으로 필수 선언
		Statement stmt = null; // 기본적으로 필수 선언
		ResultSet rs = null; // select 를 쓸때 필수
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(myURL, myId, myPw);
			System.out.println("커넥션 연결");
			stmt = conn.createStatement(); // 명령어 선언
			rs = stmt.executeQuery("select salary,ename,salary*12 from employee");
//					"select ename, salary,job,dno,nvl(commission,0),salary*12,salary*12+nvl(commission,0) from employee");
			// rs => select 를 쓰면 ResultSet 이라는 저장소에 데이터를 저장
			while (rs.next()) {
				// next() 다음줄 데이터를 모두꺼내고 다음줄로 넘어가는걸 반복

				int eno = rs.getInt("salary"); // 테이블명 이용

				String ename = rs.getString(2); // 순서를 이용

				int i = rs.getInt("salary*12");
				// 타일에 맞는 타입으로 지정

				// 테이블명을 이용하던지, 순서를 이용해 데이터를 꺼낼수 있음.

				System.out.println(eno + "\t" + ename+"\t"+i);

			}

			System.out.println("------");

			String query = "select DISTINCT dno , job from employee";

			rs = stmt.executeQuery(query);

			while (rs.next()) {

				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
