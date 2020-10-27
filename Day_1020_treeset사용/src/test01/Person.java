package test01;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	
	public Person() {}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Person o) {
		return Integer.compare(age,o.age);
	}
	@Override
	public String toString() {
		
		return name+"\t"+age;
	}
	
}
