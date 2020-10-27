
import java.util.Scanner;

/*	- 입력할 것들이 몇개인가
 *  - 출력할 것들이 몇개인가
 *  - 변수를 적을게 몇개인가
 * 
 * 
 * 	키보드로 10진수 입력 2, 8, 16, 진수로 변환
 * 	1. 입력 값이 0이면 종료한다.     x
 *  2. 입력값이 1보다 작으면 "오류" 출력후 재입력
 * 	3. 변환진수가 2 8 16이외의 값은 "오류" 출력후 재입력  
 * 	4.입력예시
 * 		10진수 : 10
 * 
 * 		변환진수 : 2
 * 		2진수 : 1010
 * 
 * 		10진수 : 15
 * 		변환진수 : 16
 * 
 * 		16진수 : F
 * 		10진수 : 12
 * 
 * 		변환진수 : 8
 * 		8진수 : 14
 * 
 * 		10진수 : 0     -->종료
 */
public class Exam_08 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
	/*
		int a = 0;
		while(true) {
			System.out.println("10진수 입력 :");
			int sib = scn.nextInt();
			if(sib<=1) {
				System.out.println("입력오류");
			}else {	
				if(sib==0) 
					break;
			}	
		}
		*/
		Scanner scn = new Scanner(System.in);
		System.out.println("10wlstn :");
		int dec=scn.nextInt();
		System.out.println("진수 :");
		int con=scn.nextInt();
		String str="";
		while(dec != 0) {
			int mok = dec / con;
			int na = dec % con;
			swich(na){
			
				
				
			}
		}
		
	}

}

