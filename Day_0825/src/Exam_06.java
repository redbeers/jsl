import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.print("a=");
		int a = scn.nextInt();
		System.out.print("b=");
		int b = scn.nextInt();

		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;//정수와 정수의 연산은 정수
		double div2 = (double)a/b;//실수와 실수를 연산할때
		int mod = a%b;//나머지를 구할때
		System.out.println(a + "+" + b + "=" +sum);
		System.out.println(a + "-" + b + "=" +sub);
		System.out.println(a + "*" + b + "=" +mul);
		System.out.println(a + "/" + b + "=" +div);
		System.out.println(a + "/" + b + "=" +div2);
		System.out.println(a + "%" + b + "=" +mod);
	}

}
