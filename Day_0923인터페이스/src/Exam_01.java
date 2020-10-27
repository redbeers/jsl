/* 추상클래스 : 미완성 설계도
 * 인터페이스 : 기본 설계도
 * 인터페이스에 들어가는 추상메소드는 abstract 를 적을 필요가없다.
 * inplements 구현한다.
 */

interface AA {
	public static final double pi = 3.14;// 상수

	public void method();// 추상메소드

	default void method1() {// 디폴트 메소드

	}

	static void method2(int x, int y) {// 정적메소드

	}

}

interface AAB extends AA {// 상속한다.

}

class AAA implements AA {// 구현한다.
	@Override
	public void method() {

	}
}

public class Exam_01 {

	public static void main(String[] args) {
		AAA a = new AAA();
		// AA aa + new AA();//불가능

	}

}
