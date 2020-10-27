/*1   2  3  4  5  6  7  8  9 
 * 	  10 11 12 13 14 15 16
 * 	     17 18 19 20 21
 * 	       22  23  24
 * 	           25
 * 
 * 다섯줄만들기, 9칸만들기, 1,3,5,7,9 줄어들
 * 25 필요, 3의배수역으로 출력, 
 */
public class Exam_10 {
	public static void main(String[] args) {
		int q = 1;

		for (int a = 0; a <= 4; a++) {
			for(int b=0; b<a; b++) {
				System.out.print("\t");
			}
			for (int x = 1; x <= 9-a*2; x++) {
				System.out.print(q + "\t");
				q++;
				
			}
			System.out.println();
		}		
	}
}