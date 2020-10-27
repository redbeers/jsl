/* 로또번호만들기
 * 
 */
public class Exam_05_로또복습 {

	public static void main(String[] args) {
		int [] lotto =new int[6];
		for(int i=0; i<6; i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0; j<i-1; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		for(int o=0; o<6; o++) {
			System.out.println(lotto[o]+" ");
		}
		
	}

}
