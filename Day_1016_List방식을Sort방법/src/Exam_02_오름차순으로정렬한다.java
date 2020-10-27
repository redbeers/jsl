import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class AA  implements Comparable<AA>{
	int bun;
	String name;



	public AA(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}

	@Override
	public String toString() {

		return bun + "\t" + name;
	}

	@Override
	public int compareTo(AA o) {
		if (bun < o.bun) {// 오름차순으로
			return -1;
		} else if (bun == o.bun) {
			return 0;
		} else {
			return 1;
		}
	}
}
public class Exam_02_오름차순으로정렬한다 {

	public static void main(String[] args) {
		Set<AA> set = new HashSet<AA>();
		AA aa = new AA(11,"sdsd");
		set.add(new AA(5,"AAA"));
		set.add(new AA(3,"BBB"));
		set.add(new AA(5,"DDD"));
		set.add(new AA(2,"CCC"));
		set.add(new AA(1,"AAA"));
		System.out.println(set);
		
		List<AA>list = new ArrayList<AA>(set);
		//list 방식으로 변환과정^^^
		//사용자정의 클래스는  sort가 불가능하다
		//sort를하기위해서는 list방식으로 변황해야한다.
		System.out.println(list);
		Collections.sort(list);//
		System.out.println(list);


	}

}
