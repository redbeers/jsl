
public class Tv_Audio {
	static void test(Control c) {
		
	}
	public static void main(String[] args) {
		Control rc;
		rc=new Tv();
		rc.turnon();
		rc.turnOFF();
		rc.setMute(true);
		Control.cgangeBattery();
		
		test(new Tv());
		test(new Audio());
		
		rc=new Audio();
		rc.turnon();
		rc.turnOFF();
		rc.setMute(false);
	
		rc.setMute(true);
	}

}
