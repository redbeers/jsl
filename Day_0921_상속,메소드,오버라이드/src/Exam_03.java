class C {
	int a=10;
	int b=20;
	
	void print () {
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}
}
class CC extends C {
	int a=100; 
	int b=200;
	int c=300;
	void ccPrint() {
		System.out.println("a=" +super.a);
		System.out.println("b=" +b);
		System.out.println("c=" +c);
	}
}
public class Exam_03 {

	public static void main(String[] args) {
		CC cc = new CC();
		cc.ccPrint();
		cc.print();

	}

}
