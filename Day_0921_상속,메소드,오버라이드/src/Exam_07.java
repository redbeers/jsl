
//instanceof 비교하는 것이 같은지 확인 한다.
class Parent {
	
}
class Child1 extends Parent{
	
}
public class Exam_07 {
	public static void name(String[] args) {
		Parent p=new Child1();
		Child1 c = new Child1();
		Child1 cc= new Child1();
		if(p instanceof Parent) { 
			System.out.println("==");
		}else {
			System.out.println("!=");
		} 
		System.out.println("===============================");
		if(p instanceof Parent) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		System.out.println("===============================");
		if(cc instanceof Child1) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		} 
	}
}
