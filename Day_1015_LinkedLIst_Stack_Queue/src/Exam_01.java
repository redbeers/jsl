import java.util.Vector;

/* List ->ArrayList,Vector, LinkedList
 * Vector : 기본크기가 정해저있다.
 * LinkedList :삽입삭제엥 용의하다, 순차적으로 진행된다.(비상연락망을 연상한다.
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		Vector v = new Vector();//기본적인 크기는 10이다.
		Vector v2 = new Vector(20);//물리적으로 크기를 정해준다.
		System.out.println(v.capacity());
		System.out.println(v2.capacity());

	}

}
