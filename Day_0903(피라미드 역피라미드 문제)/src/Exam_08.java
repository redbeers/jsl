/* 	
 * 	1
 * 	23
 * 	456
 * 	78910
 * 	~~~15
 */
public class Exam_08 { 

	public static void main(String[] args) {
		int i=1;
		for(int a=1; a<=5; a++) {
			for(int x=1; x<=a; x++) {
				System.out.print(i+ " ");
				i++;
			} 
			System.out.println();
		}
	}
}
