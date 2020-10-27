/* 상속 
 * 생성자와 private는 상송기 않된다.
 */
class A {
	int a=10;
	int b=20;
	public void print () {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	
	}
}
class AA extends A{
	
	
}
public class Exam_01 {

	public static void main(String[] args) {
	
		AA a = new AA();
		a.print();
	}

}
