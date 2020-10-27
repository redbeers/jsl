import java.util.Scanner;

/* Math.random() : 0~1사이의 난수 발생(0.11111,0.011111...
 * start ~n까지 난수 발생(정수
 * (int )(Math.random()*)+1을해야 스타트하는 곳부터 찾을수있다.
 * 입력 예시(100번 발생)
 * 수치입렵(1~?) : 6(예시)
 * 1:***(3)
 * 2:*****(5)
 * 3:
 * 4:
 * 5:
 * 6:**********(10)
 * 최대 :6(10)
 * 최소 :3(2)
 * 
 */

public class Exam_04 {

	public static void main(String[] args) {
//		int cunt=0;
//		int ra = 0;
//		for(int x=0; x<6; x++) {
//			ra = (int)(Math.random()*100)+1;
//			cunt++;
//		}
//		for(int x=0; x<ra; x++) {
//		System.out.print("*");
//		}
//		System.out.println();

		Scanner scn = new Scanner(System.in);
		System.out.println("입력하시오:");
		int num = scn.nextInt();
		int [] count = new int [num];
		for(int x=0; x<100;x++) {
			int r = (int)(Math.random()*num)+1;
			count[r-1]++;
		
		}
		System.out.println("결과 출력++++++");
		int max =-999,min=999;
		int cmax=0,cmin=0;
		for(int x=0; x<num; x++) {
			if(max<count[x]) {
				max=count[x];
				cmax=x+1;
			}
			if(min>count[x]) {
				min=count[x];
				cmin=x+1;
			}
			System.out.print((x+1)+":");
			for(int y=0; y<count[x];y++) {
				System.out.print("*");
			}
			System.out.println("("+count[x]+")");
		}
		System.out.println("최대갑 :"+cmax+"("+max+")");
		System.out.println("최소갑 :"+cmin+"("+min+")");
		
	}

}
