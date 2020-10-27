import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam_05 {

	public static void main(String[] args) {
		StringTokenizer st = null;
		try {
			Scanner sc = new Scanner (new File ("C:\\Users\\tkdql\\JAVA\\Eclips_Workspaces\\Day_1006(random)함수문제만\\src\\새 텍스트 문서"));
			while(sc.hasNextLine()) {
				String ss = sc.nextLine();
				st = new StringTokenizer(ss,",");
				while(st.hasMoreTokens()) {
					System.out.print(st.nextToken()+"\t");
				}
				System.out.print("\n");
				
			}
		}
		catch(Exception e) {
			System.out.println("파일없음");
		}

	}

}
