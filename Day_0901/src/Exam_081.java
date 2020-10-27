import java.util.Scanner;

/*	10~100 사이 정수를 키보드로 5개의 데이터를 입력받아서
 * 	합계를 구하여 출력
 * 	입력자료  : 20 50 5 80 69 9 30 50 69
 * 
 *  입력 받을 변수생성 
 *  합계 저장할 변수
 *  
 */
public class Exam_081 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		
		
		int y = 0;
		
		for(int x=0; x<4; x++) {
			int i = sc.nextInt();
			y =+x;
		}
		System.out.println("합계 :"+y);
	}

}
