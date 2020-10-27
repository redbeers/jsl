/*	1~10 홀수, 짝수 합계
 * 	1~10 홀수합 : 25
 * 	10짝수 합 :30
 * 
 */
public class Exam_07 {

	public static void main(String[] args) {
		int a = 0;// 홀수합
		int s = 0;// 짝수합
		for (int x = 1; x <= 10; x++) {
			if (x % 2 == 0) {
				a += x;
			} else {
				s += x;
			}
		}
		System.out.println("1~10홀수합 :" + s);
		System.out.println("1~10짝수합 :" + a);
		System.out.println("=========================");
		int a2 = 0;// 홀수
		int s2 = 0;// 짝수
		int sw = 0;
		for (int x = 1; x <= 10; x++) {
			if (sw == 0) {
				a2 += x;
				sw = 1;
			} else {
				s2 += x;
				sw = 0;
			}
		}
		System.out.println("1~10홀수합 :" + a2);
		System.out.println("1~10짝수합 :" + s2);
		System.out.println("=========================");
		System.out.println("while");

//		int q =0; //짝수
//		int w =0; //홀수
//		while()

	}

}
