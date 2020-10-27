/*순위구하기
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		int [] score = {60,70,80,55,70,90,66};
		for(int x=0; x<score.length; x++) {
			int r=1;
			//System.out.print(score[x] + "->");
			for (int y=0; y<score.length; y++) {
				if(score[x]<score[y]) {
					r++;
					System.out.print(score[x] + "->");
				}
			}
			System.out.println(score[x]+"->"+r);
		}
	}

}
