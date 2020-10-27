package Test_01;
import java.util.*;
/* 키보드 입력
 * 입력 : id,name,age(user01,AAA,35)
 * 출력
 * 아이디    이름    나이
 * user01 AAA  35
 * ---------
 * 처리조건
 * 1,id 중복시 "중복된 id입니다." 경고출력 후 재입력
 * 2,id가 end 이면 전체 자료를 출력하고 종료
 * split는 구분지어준다 예) "," ,있을때만다 구분지어준다.
 */
class Men {
	private String id;
	private String name;
	private int age;

	public Men() {
	}// 초기화작업

	public Men(String id, String name, int age) {// Men에 넣을 항목들
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Men) {// 비교하여 참인지 거짓인지참일때 실행
			Men m = (Men) obj;
			return m.id.equals(id);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + age;
	}
}
public class Exam_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Men> mList = new ArrayList<Men>();
		while (true) {
			System.out.print("입력");
			String[] str = scn.nextLine().split(",");
			if (str[0].equalsIgnoreCase("end")) 
				break;
			Men m = new Men(str[0], str[1],Integer.parseInt(str[2]));
			// 중복체크
			boolean bool = mList.contains(m);
			if (bool) {
				System.out.println("id 중복");
			} else {
				mList.add(m);
			}
		}
		System.out.println("아이디\t이름\t나이");
		for (Men m : mList) {
			System.out.println(m);
		}
	}

}
