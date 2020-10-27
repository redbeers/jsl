import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
//648 11-32


public class Exam_01_3전화번호부만들기 {

	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구", "김자비", "010-4545-3232");
		addPhoneNo("친구", "김사비", "010-6767-3232");
		addPhoneNo("친구", "김이비", "010-7878-3232");
		addPhoneNo("회사", "김가비", "010-8989-3232");
		addPhoneNo("회사", "김오비", "010-2133-3232");
		addPhoneNo("회사", "김고비", "010-2345-3232");
		addphoneNo("세탁", "010-7890-3232");

		printList();

	}// main
		// 그룹에 전화번호를 추가하는 메서드

	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name);// 이름은 중복될 수 있으니 전봐번호를 key로 저장한다.

	}

	// 그훕을 추가하는 메서드
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}

	static void addphoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	// 전화번호부 전체를 출력하는 메서드
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			
			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt =  subSet.iterator();
			System.out.println(" * " + e.getKey() + "{" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}//printList()
}//class
