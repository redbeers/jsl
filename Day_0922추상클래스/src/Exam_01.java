/*추상클래스 : 실체가 없는 클래스, 미완성 클래스
 * 목적 : 통일( 필드, 메소드)
 * 상속을 받아야만 사용이 가능하다.
 */ 
class AA{
	int a=10;
	public void print() {
		System.out.println("a="+a);
	}
}
abstract class BB{//abstract 클래스 앞에 써줘야 추상클래스
	int a=10;
	public void print() {
		System.out.println("a="+a);
	}
}
class BBB extends BB{
	int a=10;
	public void print() {
		System.out.println("a="+a);
	}
}
public class Exam_01 {
 
	public static void main(String[] args) {
		AA aa =new AA();
		//BB bb =new BB();//추상클래스는 못만든다.

		BBB bbb=new BBB();
	}

}
