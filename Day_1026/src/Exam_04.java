import java.io.File;
import java.io.FileOutputStream;

public class Exam_04 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\tkdql\\JAVA\\Date");
		File f = new File(f1,"date.txt");

		try {
			FileOutputStream fos = new FileOutputStream(f);
			byte by[]= {66,67,68,69,(byte)'!'};
			fos.write(by);
			fos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
