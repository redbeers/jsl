/*	10~1정수를 출력하고 마지막에 합계를 출력
 * 	10~1=55
 * 	
 */
public class Exam_05 {

	public static void main(String[] args) {
		
		//for(a=10; a>=1 ; a--)
		int s=0;
		for(int a=10; a>=1; a--){
			System.out.print(a+"\t");
			s+=a;
		}
		System.out.println(" "+s);
		
		System.out.println("while==========");
		int a=10;
		int t =0;
		while(a>=1) {
			System.out.print(a+" ");
			t+=a; // t = t+a
			a--;
		}
		System.out.println(" :"+t);
	}

}
