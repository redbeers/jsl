/* 익명 중첩 클래스
 * 이름없이 객체를 생성한다.
 * 기존 클래스의 특정 메소드를 오버라이딩하여 재정의하면 사용
 * 일회성
 * 일회성 메소드에 추가는 불가능하다.
 */

class Inner3{
	public void aaa() {
		System.out.println("AAAAAAA");
	}
	public void bbb() {
		System.out.println("BBBBBBB");
	}
}

public class Exam_04 {
	public static void main(String[] args) {
		Inner3 in3=new Inner3();
		in3.aaa();
		
		
		Inner3 in4 = new Inner3() {
			public void aaa() {
				System.out.println("AAAABBBB");
			}
//			public void ccc() {
//				System.out.println("cccc");
//			}
		};
		in4.aaa();
		in4.bbb();

	}

}
