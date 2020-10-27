/* 호출을 하면 부모먼저 생성된후 자식이 생성된다.
 * 
 */
class B{
	int a;
	int b;
//	B(){} //디폴트 생성자
//	B(){
//		System.out.println("B() 호출");
//	}
	B(int a, int b){//호출해주는 생성자가 없다면 상속할 수 없다. (super )생성장를 만들어주면된다.
		this.a=a;
		this.b=b;
	}
}
class BB extends B{
	int c;
	BB(){
		super(1,2);//super 생성자
		System.out.println("BB() 호출");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		BB bb = new BB();

	}

}
