/*
 * 1  2  3  4  5
 * 10 9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25 
 */
public class Exam_11 {

	public static void main(String[] args) {

		int a = 1;
		for (int y = 0; y <= 4; y++) {
			if (a % 2 == 0) {
				for (int x = a + 4; x >= a; x--) {
					System.out.print(x + "\t");
					if(x==a) {
						a+=5;
					}
				}
				
				System.out.println();
			}
			else {
			
				for (int x = 0; x <= 4; x++) {
					System.out.print(a + "\t");
					a++;
				}
				System.out.println();
			}
		}
	}
}
