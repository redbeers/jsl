import java.util.Scanner;

/*	키보드 입력
 * 	사원번호 출장비지급액
 *	입력예시
 *	입력 : 1234 152360
 *시원번호 출장비지급액 오만 일만 오천 오백 일백 오십 일십 오 일
 *	1234 152360   4    3   1   2  4   2   3   1 0
 *
 *	입력 : 2005 235675
 *시원번호 출장비지급액 오만 일만 오천 오백 일백 오십 일십 오 일
 *	2005 235675      4    3   1   2  4   2   3   1 0
 *
 *	입력 : 2120 198700
 *시원번호 출장비지급액 오만 일만 오천 오백 일백 오십 일십 오 일
 *	2120 198700    4    3   1   2  4   2   3   1 0
 *	               
 *	.   .   .   .   .
 *	입력 : 0 - >입력종료
 *					오만 일만 오천 오백 일백 오십 일십 오 일
 *                  4    3   1   2  4   2   3   1 0
 *                  
 *	1. 사원수 최대 10명이내로한다.
 *	
 *	[출력예시]
 *	시원번호 출장비지급액 오만 일만 오천 오백 일백 오십 일십 오 일
 *	
 *	2005 235675      4    3   1   2  4   2   3   1 0
 * 
 * 
 * 사원번호,출장비금액, 
 * 0입력시 종료
 * 사원10명이하
 * 
 */
public class Exam_03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int bun[] = new int[10];
		int pay[] = new int[10];
		int totMoney[] = new int[10];
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int cnt = 0;
		while (cnt < 10) {
			System.out.print("입력(번호 출장비) :");
			bun[cnt] = scn.nextInt();
			if (bun[cnt] == 0) {
				break;

			}
			pay[cnt] = scn.nextInt();
			cnt++;
		}
		System.out.print("번호\t출장비\t오만\t일만\t오천\t일천");
		System.out.println("\t오백\t일백\t오십\t일십\t오\t일");
		for(int x=0; x<cnt; x++) {
			System.out.print(bun[x] + "\t" + pay[x] + "\t");
			int temp = pay[x];
			for(int y=0; y<money.length; y++) {
				int mok = temp / money[y];
				System.out.print(mok+"\t");
				totMoney[y]+=mok;
				temp %=money[y];
			}
			System.out.println("\t");
		}
		
		System.out.print("전체화폐매수 :\t");
		for(int x=0; x<totMoney.length; x++) {
			System.out.print(totMoney[x]+"\t");
		}
		
	}

}
