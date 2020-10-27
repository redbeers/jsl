import javax.swing.Spring;

class D{
	int a=10;
	int b=20;
	void print() {//메소드
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	void print2(int a, int b) {//override 잘못된 예시
		
	}
}
class DD extends D{
	int a=100;
	int b=200;
	int c=300;
	@Override//어노테이션 부모클래스의 메소드를 참조하라는 뜻
	//조상 클래스와 자식글래서의 void print(){까지는 같아야한 내용은 달라도된다.
	void print() {//메소드 (오버라이딩):매소드 재정의
		super.print();//부모클래스 호출하는 super 
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
	void print2(int a , Spring b) {//override 잘못된 예시
		
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		
		DD dd = new DD();
		dd.print();
	}

}
