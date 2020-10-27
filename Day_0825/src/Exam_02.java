
public class Exam_02 {

	public static void main(String[] args) {
		byte by;
		//by = (byte)128;//강재형변화
		by = 127;
		System.out.println("byte :" + by);
		short sh;
		sh = by;
		System.out.println("short :" + sh);
		char ch = 'A';
		System.out.println("char :" + ch);
		char ch2 = 65;
		System.out.println("char :" + ch2);
		int ain = 12345567;
		long lo;
		float fl = 3.14f;
		System.out.println("float :" + fl);
		double di = 3.14;
		System.out.println("double :" + di);
		boolean bool;

	}

}
/* 자료형태 
 * 기본형(정수,실수,논리)
 * 크기단위 (Byte)= 1바이트는 (+-) 0~255 총256개지
 * 정수 (dyte[1],short[2],char(-음수를 기억하지못한다)[2],int[4],long[8])
 * 실수 (float소수이하7자리까지[4],double소수이하15자리까지[8])
 * 논리 (boolean[1])
 * 
 */
