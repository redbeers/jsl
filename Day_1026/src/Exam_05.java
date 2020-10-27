import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class Exam_05 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\tkdql\\JAVA\\Date\\abc.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f);
			byte[] by =new byte[1024];
			int count = fis.read(by);
			for(int x=0; x<count; x++) {
				System.out.println(x + " : "+(char)by[x]);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("피일없음");
		}catch(IOException ie) {
			System.out.println("파일없음");
		}

	}

}
