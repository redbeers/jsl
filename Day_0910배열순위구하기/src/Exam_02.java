/*순위구하기
 * 60 70 30
 *  2  1  3
 */
public class Exam_02 {

	public static void main(String[] args) {
		int [] score = {60,70,80,55,70,90,66};
		int[] rank = new int[score.length];
		
		for(int x=0; x<score.length; x++) {
			//int r=1;
			rank[x]=1;
			//System.out.print(score[x] + "->");
			for (int y=0; y<score.length; y++) {
				if(score[x]<score[y]) {
					//r++;
					rank[x]++;
					
				}
			//rank[x]=r;
			}
			
		}
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
		for(int x=0; x<rank.length; x++) {
			System.out.print(rank[x] + "\t");
		}
	}
}
