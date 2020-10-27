interface MyFunc4{
	public int exam(int x, int y);
}
public class Exam_05 {
	public static void main(String[] args) {
		MyFunc4 f3;
		f3=(x,y)->{
			return x+y;
			};
		
		System.out.println(f3.exam(10, 20));
		
		f3=(x,y)->x+y;
		System.out.println(f3.exam(50, 90));
		f3=(x,y)->sum(x,y);
		System.out.println(f3.exam(50, 90));
		
	}
	static int sum(int x, int y) {
		return x+y;
	}
}
