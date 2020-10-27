import java.util.Scanner;

/*	10~100 사이 정수를 키보드로 5개의 데이터를 입력받아서
 * 	합계를 구하여 출력
 * 	입력자료  : 20 50 5 80 69 9 30 50 69
 */
public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("for==============");
		System.out.println("입력자료");
		
		int sum=0;
//		for(int x=1; x<=5; x++) {
//			int a = scn.nextInt();
//			if(a>=10 && a<=100) {
//				System.out.print(a + "\t");
//				sum +=a;
//			}else {
//				x--;	
//			}
//		}
		System.out.println("while============");
		
		int x = 1;
		sum =0;
		
		while(x <=5) {
			int a = scn.nextInt();
			if(a>=10 && a<=100) {
				sum +=a;
				System.out.print(a+"\t");
				x++;	
			}
			
		}
		System.out.print(sum);
	}

}
