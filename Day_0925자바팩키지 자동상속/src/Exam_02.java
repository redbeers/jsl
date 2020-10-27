/* 자바 팩키지
 * Object 모든 클래스에 Object가 자동 상속된다
 * 
 */
class A{
	int x=10;
	
}
public class Exam_02 {

	public static void main(String[] args) {
		//Object obj = new Object();
		
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1);//여기랑
		System.out.println(a2);//여기가 주소가 다르다
		
		if(a1==a2) {
			System.out.println("a1 == a2");
		}else {
			System.out.println("a1 != a2");
		}
		String str1 = "AAA";
		if(str1 == "AAA") {
			System.out.println("str1");
		}else {
			System.out.println("str1 != AAA");
		}
	}

}
