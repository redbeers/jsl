import java.util.Scanner;
/*	키보드로 점수를 최대 10개 입력 소수를 찾아 출력하고
 *	마지막에 소수합, 갯수 출려
 *	1. 프로그램의 종료는 입력 값이 0 이거나 입력자료수가 10 
 *	2. 입력 형식
 *	정수 입력 : 5 16 17 25 33 56 0
 *	또는     : 5 16 17 25 33 56 55 45 47 67 56 78 97 99 25
 *	소수     : x  x  x.....
 *	소수합   : xx
 *	소수갯수  :xx
 * 
 */
public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//for
		int total=0;
		int count=0;
		System.out.print("전수입력 :");
		for(int x=1; x<=10; x++) {
			int su = scn.nextInt();
			if(su==0)
				break;
			if(su<2) {
				System.out.println("입력오류");
				x--;
				continue;
			}
			for(int a=2; a<=su; a++) {
				if(su%a==0) {
					if(su==a) {
						System.out.print(su + "\t");
						count++;
						total+=su;					
					}
					break;
				}
			}
		}
		System.out.println("\n 소수합계 :" + total);
		System.out.println("\n 소수합계 :" + count);
		
	}

}
