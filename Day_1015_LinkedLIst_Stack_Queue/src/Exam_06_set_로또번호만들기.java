import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Exam_06_set_로또번호만들기 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		System.out.println(set.size());
		for(int i=0; set.size()<7; i++) {
			int r = (int)(Math.random()*45+1);
			set.add(r);
		}
		System.out.println(set);
		List list = new LinkedList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
