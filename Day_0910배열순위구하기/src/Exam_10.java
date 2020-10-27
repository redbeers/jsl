
public class Exam_10 {

	public static void main(String[] args) {
		int var[][] = new int[5][6];
		
//		for (int x = 0; x < var.length; x++) {
//			for (int y = 0; y < var[x].length; y++) {
//				System.out.print(var[x][y] + "\t");
//			}
//			System.out.println();
//		}
		int cnt = 0;
		for (int x = 0; x < var.length; x++) {
			
				for (int y = 0; y < var[x].length-1; y++) {
					var[x][y] = ++cnt;
					//var[x][4]+=var[x][y];
				}
				var[x][4]=var[x][0]+var[x][1]+var[x][2];//+var[x][3];
		}
		for (int x = 0; x < var.length; x++) {
			for (int y = 0; y < var[x].length; y++) {
				System.out.print(var[x][y] + "\t");
			}
			System.out.println();
		}
	}

}
