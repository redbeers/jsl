import java.util.Scanner;

/*	2차원 배열
 * 
 */
public class Exam_07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] bun = new int[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] mat = new int[10];
		int cnt = 0;

		while (true) {
			System.out.print("입력 :");
			bun[cnt] = scn.nextInt();
			if (bun[cnt] == -99)
				break;
			kor[cnt] = scn.nextInt();
			eng[cnt] = scn.nextInt();
			mat[cnt] = scn.nextInt();
			cnt++;
		}
		System.out.println("번호\t국어\t영어\t수학\t총");
		for (int x = 0; x < cnt; x++) {
			System.out.print(bun + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + cnt);
			System.out.println(kor[x] + eng[x] + mat[x]);
		}
	}

}
