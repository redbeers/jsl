interface C{
	void print ();
	
}
class CC implements C{
	@Override
	public void print() {
		System.out.println("cccc");
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		C c = new CC();
		c.print();
		//익명 구현객체 일회성 사용 
		C cc = new C() {
			@Override
			public void print() {
				System.out.println("익명구현 객체");
				
			}
		};
		cc.print();

	}

}
