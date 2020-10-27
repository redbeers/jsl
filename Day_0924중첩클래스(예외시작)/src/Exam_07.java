/* 예외를 미루기 throws
 * 
 */

class AA{
	public void test() throws Exception {
		System.in.read();
		
		//throw //예외를 발생시켜라
	}
}
public class Exam_07 {
	public static void main(String[] args) {//throws Exception{
		
		AA a = new AA();
		try {
		a.test();
		System.in.read();
		}catch(Exception e) {
			
		}
	}
}
