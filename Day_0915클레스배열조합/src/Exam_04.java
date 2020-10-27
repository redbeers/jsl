class Sawon {
	int sabun;
	String name;
	int age;
	
	//생성자 - 객체 생성시 초기화
	Sawon(){
		this(0);
	}
	Sawon(int sabun){
		this.sabun=sabun;
	}
	Sawon(int sabun, String name){
		this.sabun=sabun;
		this.name=name;
	}
	Sawon(int s, String n, int a){
		sabun=s;
		name=n;
		age=a;
	}
	
	//사원정보출력
	public void sawonPrint() {
		System.out.println(sabun + "\t" + name + "\t" + age);
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		
		Sawon s1 = new Sawon(1, "김사원", 30);
		Sawon s2 = new Sawon(8, "안사원", 20);
		

	}

}
