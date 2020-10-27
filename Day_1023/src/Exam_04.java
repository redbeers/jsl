@FunctionalInterface
interface MyFunc2 {
	public void test(int x, int y);
}

public class Exam_04 {
	public static void main(String[] args) {
		MyFunc2 f2;
		f2=(x,y)->{
			int r =x%y;
			int a =x/y;
			System.out.println(r);
			System.out.println(y);
		};
		f2.test(5,4);
	}
}
