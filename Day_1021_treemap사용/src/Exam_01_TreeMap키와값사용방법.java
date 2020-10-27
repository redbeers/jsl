import java.util.Map;
import java.util.TreeMap;

public class Exam_01_TreeMap키와값사용방법 {

	public static void main(String[] args) {
		TreeMap<Integer, String>score = new TreeMap<Integer, String>();
		//키, 값 중에 키가같으면 새로운 값으로 변환
		score.put(1, "aaa");
		score.put(3, "sss");
		score.put(2, "fff");
		score.put(5, "ddd");
		score.put(3, "xxx");
		
		System.out.println(score);
		Map.Entry<Integer, String> m = null;
		
		m = score.firstEntry();//가장 낮은 키가들어간다.
		System.out.println(m.getKey()+m.getValue());//getkey:키, geetValue:값
		System.out.println(m);
		
		m = score.lastEntry();//가장 낮은키를 가지고온다
		System.out.println(m.getKey()+" "+m.getValue());
		System.out.println(m);
		
		m = score.higherEntry(3);//3보다높은걸찾는다
		System.out.println(m.getKey()+" " +m.getValue());
		
		m = score.floorEntry(3);//3이거나 아래
		System.out.println(m.getKey()+" "+m.getValue());
		
		m = score.ceilingEntry(3);//3이거나 위
		System.out.println(m.getKey()+" "+m.getValue());
	
		while(!score.isEmpty()) {//비어있지않으면
		m = score.pollLastEntry();
		System.out.print(m.getKey());
		System.out.println("사이즈"+score.size());
				
		}
		}

}
