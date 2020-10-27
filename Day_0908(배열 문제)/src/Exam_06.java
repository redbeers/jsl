/*	정수형 배열 20 정의 되어 있다.
 * 	1. 키보드로 정수n개를 입력받아서 배열에 저장
 * 	2. 배열에 저장된데이터를 출력하고합계를 리턴하는 메소드를 정의하시오
 * 	3. 입력자료에 -99입력의 종료를 의미한다.
 * 	4 입력예시
 * 	  입력자료 : 10 20 30 40 -99 >>>>>메서드에 출
 * 	5.출력예시
 * 	  출력자료 : 10 20 30 40
 *	  합계:!! main >>>>>>에서 출력
 * 
 * 키보드로 입력할거
 * 20개의 배열을가진거 생성
 * 합계구하기
 * 리턴하기
 * -99면 종료
 */
import java.util.Scanner;
public class Exam_06 {
	static int print (int[] a, int cnt, int s) {
		
		System.out.print("출력자료 :");
	for(int x=0; x<cnt; x++) {
		System.out.print(a[x] + "\t");
		s+=a[x];
	}
		return s;//그만 동작한다
	}
	
	public static void main(String[] args) {
//	Scanner scn = new Scanner(System.in);
//	int [] a = new int[20];
//	int sum = 0;
//	System.out.println("^^^^^^^^^내가하던");
	
		Scanner scn = new Scanner(System.in);
		int [] var = new int [20];
		int cnt=0;
		System.out.print("정수입력 :");
		while(cnt<20) {
			int a= scn.nextInt();
			if(a==-99) {
				break;
			}
			var[cnt]=a;
			cnt++;
		}
		int sum = print(var, cnt, 0);
		System.out.println("합계 :" + sum);
	
	
	}
	//test
	//static void test () {
	//	System.out.println("a");
		//return;
	//}
}
