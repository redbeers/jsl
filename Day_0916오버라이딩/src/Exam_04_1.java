class BB1{
	
	
	static int a;
	static {
		int a=100;
	}
	static int a=10;
	public void test() {
		System.out.println("a=" +a);
}
}

public class Exam_04_1 {
	BB1.a=1000;
	BB b1 = new BB1();
	b1.test();
	BB1 b2 = new BB1();
	b1.a=100;
	b1.test();
	b2.test();
}
