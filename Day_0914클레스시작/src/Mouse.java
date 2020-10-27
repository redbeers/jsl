
public class Mouse {
	//맴버변수 정의, 필드
	String mCole; //마우스 색
	int mButtons; //마우스 버튼수(2,3)
	String mSystem; //마우스 방식(볼/광)
	
	//메소드 정의
	public void onClick() {
		System.out.println("마우스가 클릭되었습니다.");
	}
	public String onDoubleClick() {
		String str = "Mouse Double Click";
			return str;
	}
	
	public int onDrag() {
		int x = 100;
		return x+5;
	}
}
