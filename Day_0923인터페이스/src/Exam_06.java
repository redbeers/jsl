//자바는 다중 상속이 불가능하다.
class Q {
	int a = 100;

	void print() {
	}
}
interface W {
	int b = 200;
	void test();
}
interface T {
	int c = 200;
	void test2();
}
class QQ extends Q implements W, T {// 다중상속불가 하지만 interface로 사용이 가능하다.
	public void test() {
	}
	public void test2() {
	}
}
public class Exam_06 {
	public static void main(String[] args) {
		QQ q = new QQ();
		q.a = 100;
		q.print();
		q.test();
	}
}
