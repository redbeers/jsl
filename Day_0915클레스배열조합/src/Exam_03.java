/* 정수 두개를 이용한 계산기(+,-,*,/,%)만들기
 * 
 * 
 */
class Cal2{
	
	
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void sup(int a, int b) {
		System.out.println(a - b);
	}
	public void mul(int a, int b) {
		System.out.println(a * b);
	}
	public void div(int a, int b) {
		System.out.println(a / b);
	}
	public void mod(int a, int b) {
		System.out.println(a % b);
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		
		Cal2 c1 = new Cal2();
		c1.add(10,20);
	}

}
