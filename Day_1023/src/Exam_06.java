import java.util.Scanner;

@FunctionalInterface
interface MySum{
	public int add(int x, int y);
}

public class Exam_06 {
	
	public static void main(String[] args) {
		//키보드로 x,y를 입력 받아서
		//x~y의 소수의 개수를 리턴하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		
		int n= sc.nextInt();
		int x= sc.nextInt();
		int re = sum(n, x);
//		System.out.println(re);
		MySum ms;
		ms=(q,z)->{
			return re;
		};
		System.out.println(ms.add(n,x));
	}

	static int sum(int a, int b) {

		int total = 0;
		int num = a;
		while (num <= b) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0 && i != num) {
					break;
				}
				if (num % i == 0 && i == num) {
					total++;
				}
			}
			num++;
		}
		return total;

	}
}
