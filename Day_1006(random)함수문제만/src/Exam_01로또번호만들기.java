import java.util.Random;

/* 로또번호 생성 1~45
 * 
 */
public class Exam_01로또번호만들기 {

	public static void main(String[] args) {
//		int [] a = new int[6]; 
//		for(int x=0; x<a.length; x++) {
//			System.out.print(" "+(int)(Math.random()*45)+1);
//			
//	}
//		int [] num = new int[6];
//		Random r = new Random();
//		for (int d = 0; d < num.length; d++) {
//			int lotto = r.nextInt(45);
//			if(num[d]==num[d-1]) {
//			
//				System.out.print(lotto + " ");
//				continue;
//			}	
//	}
		int l[] = new int[6];
		for (int x = 0; x < l.length; x++) {
			l[x] = (int) (Math.random() * 45) + 1;
			for (int y = 0; y < x; y++) {
				if (l[x] == l[y]) {
					x--;
					break;
				}
			}
		}
		for (int i = 0; i < l.length; i++) {
			
			System.out.print(l[i] + " ");
		}
	}

}
