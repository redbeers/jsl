import COM.A;

//접근제어자
//private < 디폴트 < protected < public
class SS{
	private int a= 10;
	int b=20;
	protected int c =30;
	public int d=40;
	
	public void test() {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		SS s =new SS();
		System.out.println("a="+s.a);
		System.out.println("b="+s.b);
		System.out.println("c="+s.c);
		System.out.println("d="+s.d);
		
		AA a1 = new AA();
	}

}
