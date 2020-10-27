package Thread;
class DD implements Runnable{//상속이아니다
	@Override
	public void run() {
		for(int x=0; x<5; x++) {
			System.out.println("NO");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
	}
}
public class Exam_09 {

	public static void main(String[] args) {
		Runnable r = new DD();
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int x=0; x<5; x++) {
			System.out.println("OK");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
