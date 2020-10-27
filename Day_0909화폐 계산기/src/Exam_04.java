/*	Sort	
 * 오름차순 만들기
 * 
 */
public class Exam_04 {

	public static void main(String[] args) {
		int[] val = {70,80,90,50,30,59,93};
		System.out.print("Source Data : ");
		for(int x=0; x<val.length; x++) {
			System.out.print(val[x] + "\t");
			
		}
		System.out.println("\n");
		for (int x=0; x<val.length-1; x++) {
			
			for(int y=x+1; y<val.length; y++) {
				if(val[x]>val[y]) {
					int temp = val[x];
					val[x]=val[y];
					val[y]=temp;
				}
			}
		}
		System.out.print("Sort Data : ");
		for(int x=0; x<val.length; x++) {
			System.out.print(val[x] + "\t");
		}

	}

}
