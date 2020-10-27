package Thread;
import java.awt.Toolkit;

public class Exam_06 {

	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int x=0; x<5; x++) {
			tool.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		for(int x=0; x<5; x++) {
			
			System.out.println("ok");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
