/*  중첩클래스
 * 1.중첩클래스(Inner)
 * 2.정적추업
 * 3.지역중첩
 * 4.익명중첩
 * 
 */
//중첩클래스
class Outer{
	int x=100;//공유
	private int y=200;
	private static int z=300;
	public Outer() {}
	public void disp() {//메소드
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}
	class Inner{//중첩클래스
			private int a=10;
			public void disp_in() {
				System.out.println("x="+x);
				System.out.println("y="+y);
				System.out.println("z="+z);		
		}
	}
	
}

public class Exam_01 {
	public static void main(String[] args) {
		//객체 생성 1 간접생성
		Outer ot = new Outer();//객체생성
		Outer.Inner in = ot.new Inner();//중첩클래스 객체생성방법
		
		ot.disp();
		System.out.println("===================");
		in.disp_in();
		ot.x=1000;
		
		//Inner객체 생성 2 직접 생성
		Outer.Inner in2 = new Outer().new Inner();//안에있는 클래스만 참조하고 외부클래스는 참조가 불가능하다.
		in2.disp_in();
		System.out.println("==================");
		
		Outer.Inner oi1 = ot.new Inner();
		Outer.Inner oi2 = ot.new Inner();
		oi1.disp_in();
		oi2.disp_in();
	}

}
