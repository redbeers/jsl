/*	1~100정수 출력
 * 	1,홀수만 출력 1,3,5~99 = 2500
 */
public class Exam_06 {

	public static void main(String[] args) {
		//1. 2씩 증가 방식
		int sum = 0;
		for(int x=1; x<10; x+=2) {
			System.out.print(x + "\t");
			sum+=x;
		}
		System.out.println("=" + sum);
		System.out.println();
		
		System.out.println("~~~~~~~~~~~~~~~");
		//2.1씩 증방식 + if() +%연산자
		int sum2 = 0;
		for(int x=1; x<=10; x++) {
			if(x%2==1) {
			System.out.print(x + "\t");
			sum2+=x;
			}
		}
		System.out.println("= " + sum2);
		System.out.println();
		
		
		System.out.println("~~~~~~~~~~~~~~~");
		//3. 1씩 증가방식 + if + boolean(true/false)
		int sum3=0;
		boolean bool=true;
		for(int x=1; x<=10; x++) {
			if(bool) {
				System.out.println(x + "\t");
				sum3+=x;
				bool=false;//true;
			}else {
				bool=true;//false;
			}
			System.out.println("= " + sum3);
			System.out.println();
		}
		
		System.out.println("while");
		
		int a1 = 1;
		int x1 = 0;
		while(a1<=10) {
			if(a1%2==1) {
			System.out.print(a1+"\t");
			x1 +=a1;
			}
			a1 ++;
			
		}
		System.out.println(x1);
	}

}
