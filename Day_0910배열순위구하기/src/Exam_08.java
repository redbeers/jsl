import java.util.Scanner;

/*	2차원 배열
 * 
 */
public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] hak = new int[10][4];
		
		int cnt = 0;

		while (true) {
			System.out.print("입력 :");
			hak[cnt][0] = scn.nextInt();
			if (hak[cnt][0] == -99)
				break;
			hak[cnt][1] = scn.nextInt();
			hak[cnt][2] = scn.nextInt();
			hak[cnt][3] = scn.nextInt();
			cnt++;
		}
		System.out.println("번호\t국어\t영어\t수학\t총");
		for (int x = 0; x < cnt; x++) {
			System.out.print(hak[x][0] + "\t" + hak[x][1] + "\t");
			System.out.print(hak[x][2] + "\t" + hak[x][3] + "\t");
			System.out.println(hak[x][0] + hak[x][1] + hak[x][2] + hak[x][3]);
		}
	}

}
