import java.util.Scanner;

/*	break, continue
 * 	무한 루프
 * 	for(;;){} 무한 루프
 * 	while(true){}	무한 루프
 * 	키보드로 데이터를 입력 받아서 합계를 구하여 출력
 * 	단, 입력 자료중에 0이 있으면 중단한다.
 */
public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int s=0;
		//for(;;)
		while(true){
		System.out.println("점수 :");
		int score = scn.nextInt();
		if(score==0)
			break;
		s += score;
		}
		System.out.println("합계 :" + s);
	}

}
