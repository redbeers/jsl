import java.util.Scanner;

/*	키보드로 10개의 정수 데이터를입력 받아서 합계, 평균 출력
 * 
 */
public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//for 
		int sum = 0;
		double av=0;
		System.out.println("10의 정수 입력 :");
		for(int x=1; x<=10; x++){
			int score = scn.nextInt();
			sum+=score;
			av = sum / 10.;
		}
		double ave = sum / 10;
		System.out.println("합계 :" + sum + "\t평균 :" + ave);
	}

}
