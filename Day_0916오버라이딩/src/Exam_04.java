//정적 맴버(static)

class BB{
	
//	int a;
//	static static int b;
//	public void test() {
//		int b;
//		int c;
//	}
//	public void test2() {
//		int b;
//	}
	static int a=10;
	public void test() {
		System.out.println("a=" +a);
}
}
public class Exam_04 {

	public static void main(String[] args) {
//		BB b = new BB();
//		b.a=10;
//		b.b=20;
	
//		BB.b=100;
		
		BB.a=1000;
		BB b1 = new BB();
		b1.test();
		BB b2 = new BB();
		b1.a=100;
		b1.test();
		b2.test();
	}

}
