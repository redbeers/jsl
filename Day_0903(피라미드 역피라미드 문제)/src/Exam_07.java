/*	1.
 * 	1 2 3 4 5
 * 	6 7 8 9 10
 * 	~~~25
 */
public class Exam_07 {

	public static void main(String[] args) {
//		for(int a=1; a<=25; a++) {
//			System.out.print(a + " ");
//			if(a%5==0) {
//				System.out.println();
//			}
//		}
		int a=1;
		for(int i=1; i<=5; i++) {//5
			for(int o=1; o<=5; o++) {//25
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
		
		
	}

}
