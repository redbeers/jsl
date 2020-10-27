import java.util.Scanner;

/* 키보드로 정수를 입력 받아서 "Pass" 또는 "NoPass" 출력하는 프로그램 작성
 * 1. 입력된 값이 70~90 이면 "Pass"
 * 70<=x<=90 자바에서는 사용불가능한 기호(70보다는 크거나 같고 그리고 90보다는 작거나 같다.)
 * 2. 입력값이 70~90 사이가 아니면 "NoPass"
 */
public class Exam_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수입력 :");
		int a = scanner.nextInt();
/*
		if(a>=70 && a<=90)
			System.out.println("Pass");
		else
			System.out.println("NoPass");
	*/	
		if(a>=70 && a<=90)
			System.out.println("Pass");
		
		if(a<70 || a>90)
			System.out.println("NoPass");

	}

}
