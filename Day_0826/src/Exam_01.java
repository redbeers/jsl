/* (/)는 소수점 이하를 나타내지않는다.
*  (&& 그리고, ||또는, !아니다) !를 먼저 사용한다.
*  +=,-=등의 연산자사용
*  예시)A+=B  A=A+B
*  &(and), |(or), ^(xor), ~(보수)
*  <<,>> 왼쪽으로 n비트 이동, 오른쪽으로 n비트 이동
*/ 
public class Exam_01 {

	public static void main(String[] args) {
		int a=5, b=0;
		b=a++;//후위형 더하기전에준다.
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("--------------");
		
		int c=5, d=0;
		d=++c;//전위형 더하고준다.
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		

	}

}
