interface B{
	public int add(int m, int n);
		
	public void mul(int m, int n);
	
	default void print() {//메소드
		System.out.println("인터페이스 테스트");
	}
}
class BB implements B{
	
	@Override
	public int add(int m, int n) {
		return m+n;
	}
	@Override
	public void mul(int m, int n) {
		System.out.println(m*n);
	}
}
class BBB implements B{
	@Override
	public int add(int m, int n) {
		return m+n;
	}
	@Override
	public void mul(int m, int n) {
		System.out.println("인터페이스");
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		B bb= new BB();
		int s = bb.add(10,20);
		System.out.println("s="+s);
		bb.mul(100,200);
		bb.print();
		
		bb = new BBB();

	}

}
