/*	1  2   3  4  5
 * 	6  7  8  9
 * 	10 11 12
 * 	13 14
 * 	15
 * 
 */
public class Exam_13 {

	public static void main(String[] args) {
		int q=1;
		for(int a=1; a<=5; a++ ) {
			for(int x=5; x>=a; x--) {
				System.out.print(q+"\t");
				q++;
			}
			System.out.println();
		}
			

	}

}
