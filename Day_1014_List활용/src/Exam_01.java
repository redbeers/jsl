import java.util.ArrayList;
import java.util.List;

public class Exam_01 {

	public static void main(String[] args) {
//		ArrayList l = new ArrayList(10);
//		l.add(new Integer(5));
//		l.add(new Integer(4));
//		l.add(new Integer(2));
//		l.add(new Integer(1));
//		l.add(new Integer(3));
//		
//		ArrayList l2 = new ArrayList(l.subList(1, 4));
//		print(l, l2);
//		Collections.sort(l);
//		Collections.sort(l2);
//		print(l,l2);
//		System.out.println("l.containsALL(l2):"+l.containsAll(l2));
//		l2.add("B");
//		l2.add("C");
//		l2.add(3,"A");
//		print(l, l2);
//		
//		l2.set(3, "AA");
//		print(l,l2);
//		//l에서 l2와 겹치는 부분만 남기고 나머지는 삭제
//		System.out.println("l.retainALL(l2):"+l.retainAll(l2));
//		print(l,l2);
//		//l2에서 l에 포함된 개개체들을 삭제한다.
//		for(int i=l2.size()-1; i>=0; i--) {
//			if(l.contains(l2.get(i)))
//				l2.remove(i);
//		}
//		print(l,l2);
//
//	}
//static void print (ArrayList l, ArrayList l2) {
//	System.out.println("l:"+l);
//	System.out.println("l2:"+l2);
//	System.out.println();
		
		List<String> list = new ArrayList<String>();
		if(list.isEmpty()) {//들어있는 것을 확인할때
			System.out.println(list);
		}
		
		List list2 = new ArrayList();//타입이 Object타입이라서 어느것이라도 저장이 가능하다.
		list2.add(1234);
		list2.add("ABC");
		int a=(int)list2.get(0);
	//^이부분말고  ^위에서(int)라고 변환을 해줘야한다.
		
		
		
	}
}
