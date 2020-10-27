/*	메서드(Method)
 * []배열
 */
public class Exam_01 {

	public static void main(String[] args) {
	int a=10, d=20;//입력한 정수
	String op="+";//연산자 +-/*
	if(op.equals("+")) {
		int c=a+d;
		System.out.println(a+ "+" + d+"="+c);
		
	}else if(op.equals("-")) {
		int c=a-d;
		
		System.out.println(a+ "-" + d+"="+c);
		
	}else if(op.equals("/")) {
		int c=a/d;
		System.out.println(a+ "/" + d+"="+c);
	}else if(op.equals("*")) {
		int c=a*d;
		System.out.println(a+ "*" + d+"="+c);
	}else if(op.equals("%")) {
		int c=a%d;
		System.out.println(a+ "%" + d+"="+c);
	}

	}

}
