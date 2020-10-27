import java.util.Scanner;

/*	키보드로 정수를 입력 받아서 총점 평균을 구하여 출력
 * 	1. 입력자료가 -99이면 입력의 종료
 * 	2. 최대7개까지만 입력한다.
 * 
 */
public class Exam_06 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int sum=0;
		double ave=0;
		for(int x=1; x<=7; x++) {
			int score = scn.nextInt();
			if(score==-99)
				break;
			sum+=score;
		}
		ave=sum/7.;
		System.out.println(sum+"/"+ave);
		
		System.out.println("=========================");
		
	}

}
