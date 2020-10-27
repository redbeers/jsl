import java.util.Scanner;

/*	키보드로 10개의 정수 데이터를입력 받아서 합계, 평균 출력
 * 
 */
public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// while
		System.out.println("10의 정수 입력 :");
		int con = scn.nextInt();
		int sum = 0;
		
		int whi=1;
		while(whi<=10) {
			sum += con;
			whi++;
		}
		double ave = sum / 10;
		System.out.println("합계 :" + sum + "\t평균 :" + ave);
	}
}
