import java.util.ArrayList;
import java.util.List;

public class Exam_02 {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("JAVA");
		sList.add("Oracale");
		sList.add("Servlet");
		sList.add("Oracale");
		sList.add("Python");
		sList.add("Oracale");
		System.out.println(sList);
		sList.set(2, "Jsp");//변환할때 set을사용하고 Python을 Jsp로변경하라
		System.out.println(sList);
		
		int index = sList.indexOf("Oracale");//indexOf는 원하는 것을 찾아준다.앞에서부터 찾는다
		System.out.println(index);
		
		int index1 = sList.lastIndexOf("Oracale");//lastInsdexOf는 원하는 것을 찾아준다. 뒤에서부터
		System.out.println(index1);
		
		
		
		
	}

}
