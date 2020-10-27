
public class Student {
	int bun;
	String name;
	int age;
	
	public Student() {}
	public Student(int bun, String name, int age) {
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	public void stuPrint() {
		System.out.println(bun+"\t"+name+"\t"+age+"\t");
	}
}
