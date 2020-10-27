import java.util.Scanner;

/* 키보드로 정수 2개 입력 다음과 같이 출력되는 프로그램 작성
 * 1. 입력 : 90 70
 * 	    출력 : 90>70
 * 2. 입력 : 80 90
 *    출력 : 80<90
 * 3. 입력 : 80 80
 *    출력 : 80=80
 */
public class Exam_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수입력 :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		

		if(a>b) {
			System.out.println(a + ">" + b);
		}else {
			if(a<b) {
				System.out.println(a + "<" + b);
			}else {
				System.out.println(a + "=" + b);
			}
		}


	}

}
