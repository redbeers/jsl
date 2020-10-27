/* 추상메소드는 클래스 앞에 abstract를 써서 추상메소드인지 알려야한다.
 * 메소드에 수상메소드라고 표시한다면 클래스에 꼭 추상메소드라는 것을 표시해야한다.
 * 오버라이딩은 부모클래스에서 이름이 같은 것을 호출하는것
 * 추상메소드가 하나라도 존재한다면 그 추상 메소드는 꼭 사용해야한다.
 * -클래스앞abstract사용
 * -메소드 사용불가
 * -추상메소드만 사용
 * -수상메소드로 설정해야 사용가능
 * -추상메소드는 꼭사용해야한다.
 */
abstract class CC{
	int a = 10;
	public void print () {
		System.out.println("a="+a);
	}
	public abstract void data();//추상메소드 :몸은 있지만 내용이 없는 것
} 
class CCC extends CC{
	public void data() {
		
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
