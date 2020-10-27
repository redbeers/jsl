import java.util.Scanner;

/*	키보드로 정수입력 "True", "False" 출력
 *  1. 입력값이 양수이면서 50 ~ 95 사이 이면 "True"
 *  2. 입력값이 음수임거나 50 ~ 95 사이에 포함되지 않으면"Fase"
 */
public class Exam_06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수입력 :");
		int a = scanner.nextInt();
		
		if(a>=50 && a<=95)
			System.out.println("True");
		
		if(a<50 || a>95)
			System.out.println("Fase");
			

	}

}
