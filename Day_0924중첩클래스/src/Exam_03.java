/* 지역중첩클래스
 * 메서드가 실행될 때 생성된다.
 * 독립적으로 객체생성불가
 * 상위 클래스에서 객체를 생성해야한다.
 * 
 */

class Outer2{
	private int x=100;
	private int y=200;
	public void disp() {//상위 클래스에 메소드에 클래스를 생성한다.
		class Inner2{
			private int a=10;
			private int b=20;
			public void disp_in() {
				System.out.println("x="+x);
				System.out.println("y="+y);
				System.out.println("a="+a);
				System.out.println("b="+b);
			}
		}
		Inner2 in2 = new Inner2();
		in2.disp_in();
	}
}
public class Exam_03 {

	public static void main(String[] args) {
		Outer2 ot = new Outer2();
		ot.disp();

	}

}
