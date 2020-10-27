import java.io.File;

public class Exam_01 {

	public static void main(String[] args) {
		//폴더생성
		File f = new File("C:\\Users\\tkdql\\JAVA\\Date");
		
		if(!f.exists()) {
			f.mkdir();
		}
		
		File f2 = new File(f,"abc.txt");
		
		if(!f2.exists()) {
			try {
			f2.createNewFile();
		}catch (Exception e) {}
		}
	}
}
