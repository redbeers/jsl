/* 정적 중첩 클래스
 * - 중첩 클래스는 static을 사용해야 사용이 가능하다.
 */
class Outer1{
	private int x=100;
	private static int y=200;
	public void disp_in() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	static class Inner1{//정적 중첩 클래스
		private int a=10;
		private static int b=20;
		static int c=20;
		public void disp_in() {
			//System.out.println("x="+x);//정적 중첩클래스는 일반 맴버를 사용못한다.
			System.out.println("y="+y);
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
		}
	}
	
}
public class Exam_02 {

	public static void main(String[] args) {
		Outer1 ot = new Outer1();
		ot.disp_in();
		//Outer1.Inner1 oi =ot.new Inner();
		Outer1.Inner1 oi = new Outer1.Inner1();
		oi.disp_in();
		System.out.println("=================");

		System.out.println("c="+Outer1.Inner1.c);
	}

}
