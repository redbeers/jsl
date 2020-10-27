import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* Set 인터페이스> HashSet
 * 반복자로 변환해서 불러온다.
 * 중복이 불가능하다.
 */
public class Exam_04 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();//타입이 변경가능하다
//		set.add("java");//set에 add로 데이터를 넣어준다.
//		set.add("j");
//		set.add("중복");
//		set.add("a");
//		set.add("v");
//		set.add("e");
//		set.add("중복");
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		
		System.out.println(set);
		Iterator iter = set.iterator();//반복자로 변환해준다.
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//순서는 유지하고 중복이 안되는 방법
		Set s = new LinkedHashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(3);
		
		System.out.println(s.size());
		for(Object ovj : s) {
			System.out.print(ovj);
		}
		
	}

}
