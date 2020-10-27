import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class Exam_09 {

	public static void main(String[] args) throws Exception{
		File f = new File("C:\\Users\\tkdql\\JAVA\\Date\\textexam.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
		
	}

}
