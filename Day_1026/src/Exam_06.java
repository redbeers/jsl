import java.io.*;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam_06 {

	public static void main(String[] args) throws Exception {
		DataOutputStream dos =
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(
										new File("C:\\Users\\tkdql\\JAVA\\Date"))));
		dos.writeInt(23);
		dos.writeDouble(3.14);
		dos.writeBytes("ABCDEF");
		dos.close();
	}

}
