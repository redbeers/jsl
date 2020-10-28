import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Exam_04 {

	public static void main(String[] args) {
		
		
		File f = new File("C:\\Users\\tkdql\\JAVA\\Date\\outobject.txt");
		try {
		FileInputStream fos = new FileInputStream(f);
		BufferedInputStream bos = new BufferedInputStream(fos);
		ObjectInputStream oos = new ObjectInputStream(bos);
		
		
		oos.readObject();
		 
		
		Object obj = oos.readObject();
		List l1 = (List)obj;
		System.out.println(l1);
		
//		Object obj =oos.readObject();
//		Point p  = (Point)obj;
//		System.out.println(p);
		oos.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		
		}finally {
			
		}
		
	}

}
