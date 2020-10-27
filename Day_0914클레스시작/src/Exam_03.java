class Student{
	int bun = 0;
	String name = "";
	int age = 0;
	
	void print() {
		if(bun==0) {
		System.out.print("");
		}else {
		System.out.println("번호 :" + bun);
		}
		
//		System.out.println("번호 :" + bun);
//		System.out.println("이름 :" + name);
//		System.out.println("나이 :" + age);
	}
}
public class Exam_03 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		
		Student stu2 = new Student();
		stu2.print();
		stu2.bun=1;
		stu2.name="홍길동";
		stu2.age=10;
		stu2.print();
		
		Student stu3 = stu1;
		stu3.print();
		
	}

}
