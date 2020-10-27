package Test_01;

import java.util.*;

class Mem{
	private String id;
	private String name;
	private String age;
	public Mem(String id, String name, String age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Mem) {
			Mem m =(Mem)obj;
			return m.id.equals(id);
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return id+"\t"+name+"\t"+age;
	}
}
public class Exam_06_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Mem>mList = new ArrayList<Mem>();
		while(true) {
			System.out.print("입력");
			String[] str = scn.nextLine().split(",");
			if(str[0].equalsIgnoreCase("end"))
			break;
			Mem m = new Mem(str[0],str[1],str[2]);
			
			boolean bool = mList.contains(m);
			if(bool) {
				System.out.println(m);
			}else {
				mList.add(m);
			}
		}
		System.out.println("아이디\t이름\t나이");
		for(Mem m : mList) {//m에 mlist를 넣는다.
			System.out.println(m);
		}

	}

}
