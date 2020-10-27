/*	bubble sort
 * 
 */
public class Exam_05 {

	public static void main(String[] args) {
		int[] val = {70,80,90,50,30,59,93};
		System.out.print("Source Data : ");
		for(int x=0; x<val.length; x++) {
			System.out.print(val[x] + "\t");
			
		}
		System.out.println("\n");
		//bubble sort(오름차순)
		
		for(int x=0; x<val.length-1; x++) {
			boolean bool = true;
			for(int y=0; y<val.length-1-x; y++) {
				if(val[y]>val[y+1]) {
					int temp = val[x];
					val[y]=val[y+1];
					val[y+1]=temp;
					bool=false;
				}
			}
			if(bool)
				break;
		}
		//정렬수 출력
		System.out.print("Sort Data : ");
		for(int x=0; x<val.length; x++) {
			System.out.print(val[x] + "\t");
		}
		

	}

}
