import java.io.File;

public class Exam_02 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\tkdql\\JAVA\\Date\\ssss.txt");
		if(file.exists()) {
			file.mkdir();
//			file.deleteOnExit();
			System.out.println("파일명 "+file.getName());
			System.out.println("파일경로"+file.getPath());
			System.out.println("파일경로"+file.getParent());
			System.out.println("파일크기"+file.length()+"kd");
			System.out.println("파일최종수정"+file.lastModified());
			
		}else {
			System.out.println(file.getName()+"파일이 존자하지 않는다.");
		}
	}

}
