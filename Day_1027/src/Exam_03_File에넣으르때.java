import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//객체입출력>객체직렬화(implements Serializable)객체직렬화과정
class Point implements Serializable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return "x=" + x + "\t" + "y=" + y;
	}
}
//File 연결 FileOutputStream 연결 BufferedOutputStream 연결 ObjectOutputStream 연결 WriteObject()
//File에 넣는방법
public class Exam_03_File에넣으르때 {
	public static void main(String[] args) throws Exception {
		List<Point> list = new ArrayList<Point>();
		Point p1 = new Point(10,20);
		System.out.println(p1);
		
		File f = new File("C:\\Users\\tkdql\\JAVA\\Date\\outobject.txt");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		list.add(p1);
		list.add(new Point(100,200));
		list.add(new Point(20,300));
		
		
		oos.writeObject(p1);
		oos.writeObject(oos);
		oos.close();
	}

}
