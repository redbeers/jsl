import java.util.Scanner;

/*	키보드로 10진수르 입력 받아서 2진수로 변환해서 출력
 * 	1. 입력값이 0이면 종류
 * 	2. 입력예시
 * 		10진수 : 10
 * 		2진수 : 101
 * 		10진수 : 15
 * 		2진수 : 1111
 * 		10진수 : 0
 * 		10진수 : 25
 * 		2진수 : 11001
 * 	3.입력값이 음수가 입력시 "오류" 출력후 재입력
 * 	
 */
public class Exam_07 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int sum = 0;//10진수 합계
		while(true) {
			System.out.println("10진수 입력 :");
			int num = scn.nextInt();
			if(num==0)
				break;
			if(num < 0) {
				System.out.println("입력오류:");
				continue;
			}

			sum+=num;
			//2진수 변화

			String binary = "";
			System.out.println("2진수 변화과정 :");
			while(num != 0) {
				int mok = num/2;
				int na = num%2;
				System.out.println(na + " ");
				binary = na+binary;
				num=mok;
			}
			System.out.println("\n");
			System.out.println("2진수 :" + binary);


			binary = "";
			while(sum !=0) {
				int mok = sum / 2;
				int na = sum %2;
				binary = na + binary;
				sum = mok;
			}
			System.out.println("10진수 :"+ sum);
			System.out.println("2진수 :" + binary);
		}
	}

}
