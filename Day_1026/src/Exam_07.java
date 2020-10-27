import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exam_07 {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = 
				new DataInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File ("C:\\Users\\tkdql\\JAVA\\Date\\abc.txt"))));
				
		int a=dis.readInt();
		double b = dis.readDouble();
		byte[]by= new byte[10];
		dis.read(by);
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("by=" + by.toString());
				
				

	}

}
