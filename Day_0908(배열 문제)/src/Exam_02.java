/*	메서드(Method)
 * []배열
 */
public class Exam_02 {
	static void add(int a, int d) {// +
		int c = a + d;
		System.out.println(a + "+" + d + "=" + c);
	}

	static void sub(int a, int d) {// -
		int c = a - d;
		System.out.println(a + "-" + d + "=" + c);
	}

	static void mul(int a, int d) {// *
		int c = a * d;
		System.out.println(a + "*" + d + "=" + c);
	}

	static void div(int a, int d) {///
		int c = a / d;
		System.out.println(a + "/" + d + "=" + c);
	}

	static void mod(int a, int d) {// %
		int c = a % d;
		System.out.println(a + "%" + d + "=" + c);
	}

	public static void main(String[] args) {
		int a = 10, d = 20;// 입력한 정수
		String op = "%";// 연산자 +-/*
		if (op.equals("+")) {
			add(a, d);
		} else if (op.equals("-")) {
			sub(a, d);
		} else if (op.equals("*")) {
			mul(a, d);
		} else if (op.equals("/")) {
			div(a, d);
		} else if (op.equals("%")) {
			mod(a, d);
		}

	}
}