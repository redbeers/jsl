import java.util.ArrayList;
import java.util.*;

public class Exam_07_List {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList();//공간만Integer형식으로 한것이다 실행은 가능하다
		List<Integer> list = new ArrayList<Integer>();//현재는 Integer형식으로만 받는다는 뜻이다.
		//<Integer> 이런형식은 지네릭 타입이라고한다.
		
		list.add(new Integer(100));//이런 형식으로 들어가는 것이다.
		list.add(200);
//		list.add("300");//이런식으로 하나가 들어가면 런타임 에러ㅓ가난다.
		list.add(300);
		list.add(400);
		list.add(500);
		
		int tot = 0;
		for(int i=0; i<list.size(); i++) {
			int scaor = (int)list.get(i);
			tot+=scaor;
		}
		System.out.println(tot);
	}

}
