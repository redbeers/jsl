
class Tv {
	String inch; // tv 크기25인치, 65인치
	boolean power;// 켜짐,꺼짐
	int channel;// 채널

	void power() {
		power = !power;
	}

	void channelUp() {

		if (power) {
			channel++;
			if (channel > 999) {
				channel = 0;
			}
		} else {
			System.out.println("tv 전원을 켜주세요");
		}
	}

	void channelDown() {

		if (power) {
			if (channel < 0) {
				channel = 999;
			}
			channel--;
		} else {
			System.out.println("tv 전원을 켜주세요");
		}
	}

}

public class Exam_02 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.println("tv 전원상태" + tv1.power);
//		tv1.power();
		if(!tv1.power) {
			System.out.println("전원을 켤까요(y/n)");
			int onoff=1;
			if(onoff==1) {
				tv1.power();
			}
		}
			
		if (tv1.power) {
			tv1.channelUp();
			System.out.println("tv 채널 상태 : " + tv1.channel);
			tv1.channelDown();
			tv1.channelDown();
			System.out.println("tv 채널 상태 :" + tv1.channel);

		}
	}

}
