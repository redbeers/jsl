import java.io.IOException;

/* 예외처리
 * (Exception)
 * Error
 */

public class Exam_06 {
	public static void main(String[] args) {
		
		
		System.out.println("1문자 입력 : ");
		try {
		int a=System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception ee) {
			ee.printStackTrace();
		}finally {
			
		}
	}

}
