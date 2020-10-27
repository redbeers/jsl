import java.util.TreeSet;

/* 검색기능이 강화된 컬렉션
 * 자동정렬이 된다.
 * 기본자료형식
 * 사용자가만든 클래스는 자동정렬이 불가능
 * 따로 만들어서 정렬해줘야한다.
 * TreeSet, TreeMap
 * 자동정렬,중복불가,Set기능을 물려받는다
 *
 */
public class Exam_01 {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(90);
		tset.add(80);
		tset.add(30);
		tset.add(99);
		tset.add(100);
		
		System.out.println(tset);

	}

}
