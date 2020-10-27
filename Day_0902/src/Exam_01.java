/*	1-2+3-4+5-6+7-8+9-10=
 * 	for(), while()
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {

		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			if (a % 2 == 0) {
				sum -= a;
				System.out.print("-"+a);
			}else{
			System.out.print("+"+a);
			sum +=a;
			}
		}
		System.out.println("=" + sum);
		System.out.println("==========");
		int s=0;
		boolean sw=true;
		for(int x=1; x<=10; x++) {
			if(sw) {
				System.out.print("+"+x);
				s+=x;      //s1x2
				sw=false;
			}else {
				System.out.print("-"+x);
				s-=x;
				sw=true;
			}
		}
		System.out.println("="+s);
		System.out.println("========================");
		
		sum = 0;
		int op = 1;// 연산자용
		for (int x = 2; x <= 10; x++) {
			int m = x * op;
			sum += m;
			op = op * (-1);
			System.out.print(sum+" ");
			//1. x1, op1, m1, sum1, op-1, =-1
			//2. x2, op-1, m-2, sum-2,  
		}
		System.out.println("sum" + sum);
		System.out.println("========================");

		int wa = 1;
		
//		while(wa<=10) {
//			if()
//		}
	}

}
