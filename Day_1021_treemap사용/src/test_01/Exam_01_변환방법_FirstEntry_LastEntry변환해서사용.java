package test_01;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class Person implements Comparable<Person>{
	//age끼리 정렬해준다. 클래스앞에Comparable<E 보통 클래스이름을적어준다>을사용해야 정렬이 가능하다.
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
	
		return name+" :"+age;
	}
	@Override
	public int compareTo(Person o) {
		//age끼리 정렬해준다. 클래스앞에Comparable<E 보통 클래스이름을적어준다>을사용해야 정렬이 가능하다.
		
		return Integer.compare(age, o.age);
	}
}
public class Exam_01_변환방법_FirstEntry_LastEntry변환해서사용 {

	public static void main(String[] args) {
		TreeMap<Person,Integer> map = new TreeMap<Person,Integer>();
		map.put(new Person("AAA",24),95);
		map.put(new Person("sss",43),95);
		map.put(new Person("ddd",13),65);
		map.put(new Person("fff",32),96);
		map.put(new Person("eee",53),69);
		
		//set에 map의key값을 넣어준다.
		Set<Person> set = map.keySet();
		System.out.println(map);
		for(Person Key : set) {//확장for문
			System.out.println(Key  +" " +map.get(Key));
		}
		//반복자변환
		//map.firstEntry(),map.lastEntry()사용하기위해 사용
		System.out.println();
		Iterator<Person> i = set.iterator();
		while(i.hasNext()) {
			Person Key = i.next();
			System.out.println(Key +" "+map.get(Key));
		}
		
		map.lastEntry();
	}
}
