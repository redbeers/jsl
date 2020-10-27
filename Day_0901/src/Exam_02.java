/*	1 2 3 4~100출력
 * 	
 */
public class Exam_02 {

	public static void main(String[] args) {
		for(int x=1; x<=100; x++) {
			System.out.print(x + "\t");
			if(x%10==0)
				System.out.println();
		}
		System.out.println("while()--------");
		int i=1;
		while(i<=100) {
			System.out.print(i + "      ");
			if(i%5==0)
			System.out.println();
		i++;
		}

	}

}
