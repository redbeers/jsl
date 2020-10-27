
class E {
	int a=10;
	int b=20;
	
	void print () {//오버라이딩
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
//final 을 사용하면 상속을 못하게한다.
//final 클래스 변수 메소드 모두에 사용가능
final class EE extends E{
	final int c=300;
	final void eePrint() {//오버라이딩
		System.out.println("a="+a);
		System.out.println("c="+c);
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		
//		E e = new E();
//		e.a=100;
//		EE ee =new EE();
//		ee.a=100;
//		ee.c=200;
//		ee.print();
//		ee.eePrint();
		
		E e = new EE();
		
		e.print();
		//오버라이딩이 실행되면 부모클래스에있는 메소드가 실해되는 것이 아닌 자식클래스에있는 메소드를 실행한다.
		//e.eeprint();//부모 클래서에서 상속하지 않은 것은 사용할수 없다.
	}

}
