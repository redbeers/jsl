import java.util.HashSet;
import java.util.*;
/* 날짜, 기본자료형 ,String >sort
 * list타입이어야한다.
 * 
 */
public class Exam_01_Set을Liste방식으로변환한다 {

	public static void main(String[] args) {
		
		Set<String >set = new HashSet<String>();
		set.add("java");
		set.add("java");
		set.add("java");
		set.add("Servalet");
		set.add("Oracle");
		
		//리스트방식으로 변환
		List<String>list = new ArrayList(set);
		//list 방식으로 변환과정^^^
		//사용자정의 클래스는  sort가 불가능하다
		//sort를하기위해서는 list방식으로 변황해야한다.
		System.out.println(list);
		Collections.sort(list);//
		
		
		

	}

}
