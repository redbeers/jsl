package java.com.java.exam;

import java.util.Scanner;

/* 키보드로 번호, 이름 국어 영어 수학 입력 Student 객체(최대 10명)
 * 입력형식
 * 등록 : 1 aaa 90 80 80
 * 등록 : 2 sss 39 49 20
 * *********
 * 등록 : -99 > 입력종료
 * 출력 형식 -1
 * 번호  이름  총점  평균    석차
 * 1  ㅇㅇㅇ  ㅌㅌ  ㅌㅌ.ㅌ  
 *  
 *  
 *  입력 받을 거
 *  번호 이름 국어 영어 수학
 *  
 *  연산작업
 *  평균 총점
 *  
 *  출력
 *  번호 이름 국어 영어 수학  총점 평균 석차
 */
public class Suexam {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt =0;
		while(true) {
			System.out.print("등록 :");
			int bun = sc.nextInt();
			if (bun ==-99)
				break;
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			int tot = kor+eng+mat;
			
			
			Sudata.su[cnt]= new Su(bun,name,tot);
			
			
		}
		for(int x=0; x<cnt; x++) {
			cnt++;
			System.out.print(Sudata.su[x]+kor);
		}

	}

}
