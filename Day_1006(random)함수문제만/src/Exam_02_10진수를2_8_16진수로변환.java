import java.util.Scanner;

/* 10진수 입력 2, 8, 16 변환 프로그램 작성
 * 입력 : 45
 * 변환(2,8,16) :2
 * 10진수 45는 2진수로 xxxxxx입니다.
 * 
 * 
 * printf(%b,n); >boolena 형식으로출력
 * printf(%d,n);>정수 형식으로 출력
 * printf(%o,n);>8진수 형식으로 출력
 * printf(%x,n);>16진수 형식으로 출력
 * printf(%f,n);>소수점 형식으로 출력
 * printf(%c,n);>문자형식으로 출력
 * printf(%s,n);>무자열 형식으로 출력
 * printf(%n,n);>줄바꿈
 * printf(%e,n);>지수 표현식의 형식으로 출력
 */
public class Exam_02_10진수를2_8_16진수로변환 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		int i = a.nextInt();
		String binary = Integer.toBinaryString(i);
		String cotal = Integer.toOctalString(i);
		String hex = Integer.toHexString(i);
		System.out.println(binary);
		System.out.println(cotal);
		System.out.println(hex);
		

	}

}
