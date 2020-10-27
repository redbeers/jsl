/* 2차원 배열
 *
*/
public class Exam_02 {

	public static void main(String[] args) {
	int a[][] = new int [5][5];
	int cnt= 0;
	for (int x=0; x<a.length-1; x++) {
		for( int y=0; y<a[x].length-1; y++) {
			cnt++;	
			a[x][y]=cnt;
		}
		
		a[x][a.length-1] = a[x][0]+a[x][1]+a[x][2]+a[x][3];
	}
	for(int x=0; x<a.length; x++) {
		a[4][x] = a[0][x]+a[1][x]+a[2][x]+a[3][x];
		}
	
		
	for(int x=0; x<a.length; x++) {
		for(int y=0; y<a[x].length; y++) {
			System.out.print(a[x][y]+ "\t");
		}
		System.out.print("\n");
	}

	}

}
