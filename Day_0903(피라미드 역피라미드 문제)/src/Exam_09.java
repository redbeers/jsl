/*
 * 12345
 * 	6789
 * 	~~15
 */
public class Exam_09 {

	public static void main(String[] args) {
		int q = 1;

		for (int a = 0; a <= 4; a++) {
			for(int b=0; b<a; b++) {
				System.out.print("\t");
			}
			for (int x = 1; x <= 5-a-a; x++) {
				System.out.print(q + "\t");
				q++;
				for (int y = 5; y >= 1; y--) {
				}
			}
			System.out.println();
		}		
	}
}
