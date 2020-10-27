/*	1리턴타입이 없고, 매개변수도 없는 경우 
 * 
 */
public class Exam_03 {
	// 1. '*'10개 출력 하는 메소드 작
	static void metho1() {
		for(int x=0; x<=9; x++) {
			System.out.print("*");
		}
		System.out.println();
	}
	// 2. 리턴타입이 없고, 매개변수가 있는 경우
	static void metho2(String str, int a) {
		int s=0;
		for(int x=1; x<=a; x++) {
			System.out.print(x+"\t");
		}
		System.out.println("\n" + str + "=" + s);
	}
	// 3. 리턴타입이 있고, 매개변수가 없는 경우
	static int metho3() {
		int s=0;
		for(int x=1; x<=10; x++) {
			s+=x;
		}
		return s;
	}
	// 3. 리턴타입이 있고, 매개변수가 있는 경우
	static String metho4(int a, int d) {
		int s=9;
		for(int x=a; x<=d; x++) {
			s+=s;
		}
		return s+" ";
	}
	public static void main(String[] args) {
//		metho1();
//		metho2("합계", 10);
//		String str ="합계";
//		int a=20;
//		metho2(str,a);
//		int s=metho3();
//		System.out.println(metho3());
//		System.out.println(s);
		
		String ss = metho4(1,100);
		System.out.println(ss);
		System.out.println(metho4(1,10));
	}

}
