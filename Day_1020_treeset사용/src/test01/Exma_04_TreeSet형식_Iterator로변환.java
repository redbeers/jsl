package test01;

import java.util.Iterator;
import java.util.TreeSet;

public class Exma_04_TreeSet형식_Iterator로변환 {

	public static void main(String[] args) {
		//사용자가만든 클래스는 TreeSet에 들거가지못한다.
		TreeSet<Person> set = new TreeSet<Person>();
		set.add(new Person("sss",49));
		set.add(new Person("aaa",39));
		set.add(new Person("ddd",19));
		set.add(new Person("fff",29));
		
//		while(set.hasNext()) {
//		//불가능하기때문에 Iterator형식으로변환해줘야한다.
//			
//		}
		Person a = set.first();
		
		
		Iterator<Person> s = (Iterator<Person>) set.iterator();//Set형식을 Iterator형식으로 변환해줘야한다.
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		
		

	}

}
