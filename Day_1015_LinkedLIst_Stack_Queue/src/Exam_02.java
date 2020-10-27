import java.util.*;

/* stack
 * 입구가하나이다.
 * 순차적으로 들어가지만 ArrayList,LinkedList와는 다르다
 * 꺼내올때 데이터가 지워진다.
 * 삽입 pushDown
 * 삭제popUp
 * peek // 가장 위에있는 데이터를 꺼내오지만 데이터는 보존된다.
 * 
 */
public class Exam_02 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		
		String string =(String) s.peek();//삭제는 안되지만 잠시꺼내온다.
		System.out.println(string);
		System.out.println(s.size());//총 size를 확인한다.
		while(!s.isEmpty()) {//확인해서 없다면
			System.out.println(s.pop());//하나씩꺼내온다.
		}
		System.out.println(s.size());//모두 꺼내와서 전부지워진다.
		
	}

}
