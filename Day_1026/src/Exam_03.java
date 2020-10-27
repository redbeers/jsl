import java.io.File;

public class Exam_03 {

	public static void main(String[] args) {
		File f =new File("C:\\Date");
		String[] fl = f.list();
		
		for(String str: fl) {
			System.out.println(str);
		}
		System.out.println("-----------------------");
		File[] fl2 = f.listFiles();
		for(int x=0; x<fl2.length; x++) {
			if(fl2[x].isFile()) {
			System.out.println("파일이름"+fl2[x].getName());
				System.out.println("파일크기"+fl2[x].length()+"kb");
			}
		}
	}

}
