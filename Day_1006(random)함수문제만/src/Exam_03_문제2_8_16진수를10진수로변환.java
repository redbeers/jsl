import java.util.*;

/* 2, 8, 16진수 입력 10 변환 프로그램 작성
 * 입력 : 11011
 * 변환(2,8,16) : 16
 * 2,8,16중진수 10011는 16진수로 xxxxxx입니다.
 * 
 */
public class Exam_03_문제2_8_16진수를10진수로변환 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String b=sc.nextLine();
		int a2 = Integer.valueOf(b,2);
		int a8 = Integer.valueOf(b,8);
		int a16 = Integer.valueOf(b,16);
		System.out.println(a2);
		System.out.println(a8);
		System.out.println(a16);
	}

}
