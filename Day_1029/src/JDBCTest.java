import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
		}catch(Exception e) {
			System.out.println("드라이");
		}
		try {
			Connection con = 
					DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
							"jslhrd46","asdf");
			System.out.println("db 연결 성공:" + con);
		}catch(Exception e) {System.out.println("실패");
		
		}
	}

}
