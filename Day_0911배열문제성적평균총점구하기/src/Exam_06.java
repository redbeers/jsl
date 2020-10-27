
public class Exam_06 {
	static void scoreSort(int a[][]) {
		
		for(int x=0; x<a.length-1; x++) {
			for(int y=+1; y<a.length; y++) {
				if(a[x][0]>a[y][0]) {
					for(int k=0; k<a[x].length; k++) {
					int temp = a[x][k];
					a[x][k]=a[y][k];
					a[y][k]=temp;
				}
			}
			}
		}
	}

	public static void main(String[] args) {

		int score[][] = { { 1, 90, 80, 90, 0 }, { 5, 88, 77, 69, 0 }, { 3, 90, 88, 90, 77, 0 }, { 2, 90, 80, 90, 0 },
				{ 4, 70, 90, 85, 0 } };

		System.out.println("번호\t국어\t영어\t수학\t총점");
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x][0] + "\t");
			System.out.print(score[x][1] + "\t");
			System.out.print(score[x][2] + "\t");
			System.out.print(score[x][3] + "\t");
		}
		for (int x = 0; x < score.length; x++) {
			for (int y = 0; y < 4; y++) {
				score[x][4] = score[x][0] + score[x][1] + score[x][2];
				System.out.print(score[x][y] + "\t");
			}
		}
		System.out.print("\n");
		scoreSort(score);
		for (int x = 0; x < score.length; x++) {
			for (int y = 0; y < score[x].length; y++) {
				score[x][4] = score[x][0] + score[x][1] + score[x][2];
				System.out.print(score[x][y] + "\t");

			}
			System.out.println();
		}
	}
}
