
public class Car {
	// 속성 -> 변수 (맴버변수, 맴버필드)
	String company = "현대";// 자동차회사
	int cc = 2000;// 자동차 cc
	int speed = 100;// 속도
	boolean starting = true;// 시동상태
	// 기능 증이 -> 메소드
	// 시동 걸고/끄고
	public void startOn() {
		starting =! starting;
	}
	// 속도 올리기
	public void speedUp() {
		speed++;
		System.out.println("현재속도 :" + speed);
	}
	public void speedDown() {
		speed--;
	}
	// 속도 내리기
}

	
