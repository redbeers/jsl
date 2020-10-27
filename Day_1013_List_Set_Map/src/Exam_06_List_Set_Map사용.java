import java.util.*;
import java.util.List;

/* List :순서가 있다. 중복이 가능
 * Set :숫서가 없다. 중복이 없다.
 * Map :키와 값이 쌍으로 움직인다.순서없다. 키중복없다. 값중복있다.
 * 
 * 
 * List: ArrayList,Vector(동기화가 있다.), LinkedList(비상연락망)
 */
public class Exam_06_List_Set_Map사용 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(100);
		list.add("Java");
		list.add(3.14);
		list.add('a');
		
		System.out.println("List :" +list);
		
		list.add(1,"김지바");
		System.out.println(list);
		System.out.println(list.get(3));
		for(int i=0; i<list.size(); i++) {
			Object str = list.get(i);//들어갈때 Object이면 나오때도 Object로 불러와야한다. 
			System.out.print(str);
		}
		
		ArrayList aL = new ArrayList(10);

	}

}
