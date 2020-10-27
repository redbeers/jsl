import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Exam_02 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader(new File("C:\\\\Users\\\\tkdql\\\\JAVA\\\\Date\\\\hakexam.txt")));
		String data = "";
		while(true) {
			data = br.readLine();
			if(data == null){
				break;
				
			}
		}
		
	}

}
