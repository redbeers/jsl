
public interface Control {//인터페이스에는 static final public이다.생략이 가능하다
	
	//static final int MAX_Volume=10;//생략이 가능하다.
	//추상 메소드 정의
	int MAX_Volume=10;
	int MIN_VOLUME=0;
	
	public void turnon();
	public void turnOFF();
	public void but();
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			
			System.out.println("무음 처리한다.");
		}else {
			System.out.println("무음처리 안한다.");
		}
	}
	//정적메소드
	static void cgangeBattery() {
		System.out.println("건전지를 교체한다.");
	}
}
