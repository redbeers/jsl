import java.util.LinkedList;
import java.util.Queue;

/* Queue 인터페이스가아니다.
 * 혼자서 객체를 생성할수없다.
 */
public class Exam_03 {

	public static void main(String[] args) {
		Queue que = new LinkedList();//Queue 생성방법
		
		que.offer("A");
		que.offer("B");
		que.offer("C");
		que.offer("D");
		
		System.out.println(que.size());
		String str = (String)que.peek();
		System.out.println(str);
		while(!que.isEmpty()) {
			System.out.println(que.size());
		}
		
	}

}
