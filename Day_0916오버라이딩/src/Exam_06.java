//final, 상수

class FF{
	int s = 100;
	static final int MAX = 100;
	static final double PI = 3.14; 
}
public class Exam_06 {

	public static void main(String[] args) {
		FF f = new FF();
		f.s=200;
//		f.MAX=200;
		if(f.MAX<100) {
			System.out.println();
		}
	}

}
