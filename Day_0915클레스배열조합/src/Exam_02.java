/* 정수 두개를 이용한 계산기(+,-,*,/,%)만들기
 * 
 * 
 */
class Cal{
	int a;
	int b;
	
	public void add() {
		System.out.println(a + b);
	}
	public void sup() {
		System.out.println(a - b);
	}
	public void mul() {
		System.out.println(a * b);
	}
	public void div() {
		System.out.println(a / b);
	}
	public void mod() {
		System.out.println(a % b);
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		
		Cal c1 = new Cal();
		c1.a=100;
		c1.b=50;
		c1.add();
		c1.sup();
		c1.mul();
		c1.div();
		c1.mod();
		

	}

}
