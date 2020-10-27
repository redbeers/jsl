import java.util.TreeSet;

public class Exam_03 {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(90);//이렇게도 가능하지만
		tset.add(new Integer(90));//기본적으로 이런형식을 해야한다.
		tset.add(new Integer(60));
		tset.add(new Integer(20));
		tset.add(new Integer(80));
		tset.add(new Integer(40));
		System.out.println(tset);
		Integer score = null;
		score = tset.first();//높은점수찾기
		System.out.println(score);
		score = tset.last();//낮은점수찾기
		System.out.println(score);
		score = tset.lower(85);//85아래 하나를찾는다.
		System.out.println(score);
		score = tset.higher(85);//85위로하나 찾는다
		System.out.println(score);
		score = tset.floor(85);//85거나85아래하나찾는다.
		System.out.println(score);
		score = tset.ceiling(85);//85나 85위로 하나찾는다.
		System.out.println(score);
		
		while(!tset.isEmpty()) {
			
			score = tset.pollFirst();//꺼내면서 지워온다(pollFirst)처음부터(pollLast)마지막부터
			System.out.println(score+"\t");
			System.out.println("남았다"+tset.size());
		}
		
	}

}
