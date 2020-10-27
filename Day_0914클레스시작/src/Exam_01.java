//클래는 첫글자가 대문자
//변수는 소문자
//메소드는 소문자로 쓰고 뒤에 () 사용

public class Exam_01 {

	public static void main(String[] args) {
		int sum; //변수
		sum=0;
		String str;//리퍼런스(조)변수
		str = "";
		
		Mouse m1; //리퍼런스(조)변수
		m1 = new Mouse(); //인스턴스화
		m1.mCole = "블루";
		m1.mButtons = 3;
		m1.mSystem="광";
		System.out.println("마우스 색상 :" + m1.mCole);
		m1.onClick();
		//m1.onDoubleClick();
		m1.onDrag();
		Mouse m2 = new Mouse();
		m2.mCole = "화이트";
		m2.onClick();
				
	}

}
