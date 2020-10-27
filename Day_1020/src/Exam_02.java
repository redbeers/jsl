import java.util.Set;
import java.util.TreeSet;

public class Exam_02 {

	public static void main(String[] args) {
		TreeSet tset = new TreeSet();//TreeSet이가지고있는 고유한기능사용
		Set set = new TreeSet();//Set이 가진 기능만사용
		
		int[] score = {80,90,49,39,40,29,94,85};
		
		for(int x=0; x<score.length; x++) {
			tset.add(score[x]);//tset에 add로 넣어준다.
		}
		System.out.println(tset);//자동 오름차순정렬
		//75보다 작은것 찾아라
		System.out.println(tset.headSet(new Integer(75)));
		//headSet으로 찾는기능 Integer형식
		
		Set sett = tset.tailSet(75);//75보다 큰거찾아라
		System.out.println(sett);
		
	}

}
