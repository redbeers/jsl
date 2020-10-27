import java.io.File;
import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) throws Exception {
		try {
		Scanner sc = new Scanner(new File ("C:\\Users\\tkdql\\JAVA\\Eclips_Workspaces\\Day_1007\\src\\student.txt"));   
		String data = null;
		
		while((data=sc.nextLine())!=null) {
			String[] stu = data.split(",");
			for(int i=0; i<stu.length; i++) {
			int jum=Integer.parseInt(stu[i]);
			}
		}
		for(int x=0; x<stu.le)
		}
		catch(Exception e) {
			System.out.println("파일없음");
		}
	}

}
