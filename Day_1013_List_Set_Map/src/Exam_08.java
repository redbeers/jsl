import java.lang.reflect.Array;
import java.util.*;


public class Exam_08 {

	public static void main(String[] args) {
		List<String> sL = new ArrayList<String>();
		ArrayList aa = new ArrayList();
		
		
		
		sL.add("java");
		sL.add("2");
		sL.add("3");
		sL.add(2,"4");
		sL.add("5");
		System.out.println(sL);
		sL.remove(0);
		System.out.println(sL);
		sL.set(1, "7");
		System.out.println(sL);
		//리스트안에있는것을 보기만 한것이다.
		
		//1
		for(int i=0; i<sL.size(); i++) {
			String st = sL.get(i);
			System.out.print(st);
		}
		System.out.println();
		
		for(String st : sL) {
			System.out.print(st+"\t");
			
		}
		System.out.println();
		//반복자
		System.out.println("=============");
		Iterator<String> it = sL.listIterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s);
		}
		System.out.println();
		
		Collections.sort(sL);//객체 정렬
		System.out.println(sL);
		
		List<Integer>iLi = new ArrayList<Integer>();
		iLi.add(89);
		iLi.add(84);
		iLi.add(34);
		iLi.add(59);
		iLi.add(40);
		iLi.indexOf(678);
		System.out.println(iLi.indexOf(3));
		
		Collections.sort(iLi);
		System.out.println(iLi);
	}

}
