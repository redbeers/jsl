import java.util.Scanner;

/*	키보드로 번호 이름 국어 영어 수학 점수 입력 총점, 편균을 구하여 출력
 *  1. 입력형식
 *  학생등록 : 5 김학생 90 80 90
 *  학생등록 : 3 이학생 88 85 95
 *    *  *  *  *  *
 *  학생등록 :-99 ->입력종료
 *  
 *   2. 출력 형식 -1
 *   번호 이름 국어 영어 수학 총점 평균
 *    5 김학생 90  80  90 260
 * 	  3 ...   .   .   .   .   .
 * 
 *  3. 출력 형식 -2 (총점을 기준으로 내림차순 출력)
 *  번호  이름  국어 영어 수학 총점 평균
 */
public class Exam_07 {

	public static void main(String[] args) {
		int[][] score = new int [10][5];
		String[] name = new String [10];
		double[] ave = new double[10];
		Scanner scn = new Scanner (System.in);
		int cnt =0;
		while(cnt<10) {
			System.out.print("등록 :");
			score[cnt][0] = scn.nextInt();
			if(score[cnt][0]==-99) {
				break;
			}
			name[cnt] = scn.next();//이름
			score[cnt][1] = scn.nextInt();//국어
			score[cnt][2] = scn.nextInt();//수학
			score[cnt][3] = scn.nextInt();//영어
			score[cnt][4] = score[cnt][1]+score[cnt][2]+score[cnt][3];
			ave[cnt] = score[cnt][4]/3.;
			cnt++;
		}
		//출력-1
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int x=0; x<cnt; x++) {
			System.out.print(score[x][0]+ "\t");//번호출력
			System.out.print(name[x]+"\t");//이름출력
			for(int y=1; y<score[x].length; y++) {
				System.out.print(score[x][y] + "\t");//국,영,수,총점출력
			}
			System.out.print(ave[x]+"\n");//평균출력
		}
		//출력-2
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				for(int x=0; x<cnt; x++) {
					System.out.print(score[x][0]+ "\t");//번호출력
					System.out.print(name[x]+"\t");//이름출력
					for(int y=1; y<score[x].length; y++) {
						System.out.print(score[x][y] + "\t");//국,영,수,총점출력
					}
					System.out.print(ave[x]+"\n");//평균출력
				}
	}

}
