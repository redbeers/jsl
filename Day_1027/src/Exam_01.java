import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/* 번호  이름  국어  영어  수학  총점  평균
 * 
 * ,구분이 아닌 뛰어쓰기까지 구분하여 총점평균구하기
 */
public class Exam_01 {

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(new File("C:\\Users\\tkdql\\JAVA\\Date\\hakexam.txt"));
		String data = null;
		String jum[] = null;
		
		while(scn.hasNext()) {
		data=scn.nextLine();
		
		String hak [] = data.split(" ");
		int jum1=Integer.parseInt(hak[2]);
		int jum2=Integer.parseInt(hak[3]);
		int jum3=Integer.parseInt(hak[4]);
		int tot = jum1+jum2+jum3;
		
		System.out.println();
		}

	}

}
