/*               1
 *            2  3
 *        4   5  6
 *     8  9  10 11
 * 12 13 14  15 16
 */


public class Exam_12 {

	public static void main(String[] args) {
		int x1=1;
		int y1=1;
		int t=5;
//		for(int x=1; x<=5; x++) {
//			for(int y=1; y<=x; y++) {
//				System.out.print(x1+"\t");
//				x1++;
//			}
//			System.out.println();
//		}
		for (int x = 1; x <= 5; x++) {
			for (int k = 0; k < 5 - x; k++) {
				System.out.print("\t");
			}
			for (int y = 1; y <= x; y++) {
				System.out.print(x1+"\t");
				x1++;
			}
			System.out.println();
		}
	}
}
