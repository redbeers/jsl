/*	1~10 정수를 출력하고 마지막합계를 구하기
 * 	
 */
public class Exam_04 {

	public static void main(String[] args) {
		System.out.println("for");
		int a=1;
		int x=0;
		for(a=1; a<=10; a++) {
			System.out.print(a + "\t");
			x = x+a;
			
		}
		System.out.print(x);

		System.out.println("\n"+"while");
		while(a<=10) {
			System.out.print(a+"\t");
			x +=a;
			a++;
		}
		System.out.print(x);
	}

}
