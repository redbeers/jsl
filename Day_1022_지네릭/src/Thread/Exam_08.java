package Thread;

public class Exam_08 {

	public static void main(String[] args) {
		//일회성으로 사용할때는 이런식으로해도된다.
		Thread thread  = new Thread() {
			public void run() {for(int x=0; x<5; x++) {
				System.out.println("NO");
				try {
					Thread.sleep(500);
				}catch(Exception e) {}};
		}
		};
		thread.start();
		
			for(int x=0; x<5; x++) {
				System.out.println("OK");
				try {
					Thread.sleep(500);
				}catch(Exception e) {}
			
		}
	}

}
