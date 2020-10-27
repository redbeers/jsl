
class D{
	
	private int no;
	public D(int no) {
		this.no=no;
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no+"번쩨가 소멸한다.");
	}
}
public class Exam_07 {

	public static void main(String[] args) {
		D d1 = new D(20);
		
		for(int x=0; x<50; x++) {
			d1 = new D(x);
			d1 = null;
			System.gc();//조금 빨리 실행한다.
		}

	}

}
