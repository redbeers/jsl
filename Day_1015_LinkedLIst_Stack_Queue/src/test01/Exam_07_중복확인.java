package test01;

import java.util.HashSet;
import java.util.Set;

class Member{
	
	private String name;
	private int age;
	
	public Member() {}
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.name.equals(name) &&m.age==age;
		}else {
			return false;
		}
		
	}
	@Override
	public int hashCode() {//hashCode는 비교해주는 요석이당.
		return name.hashCode()+age;
	}
	public String toString() {
		return name +"\t"+age;
	}
	
}
public class Exam_07_중복확인 {

	public static void main(String[] args) {
		Set<Member> mSet = new HashSet<Member>();
		Member m = new Member("AAA",28);
		boolean bool = mSet.add(m);
		
		System.out.println(bool);
		System.out.println(mSet);
		
		bool = mSet.add(new Member("BBB",30));
		System.out.println(bool);
		System.out.println(mSet);
		
		bool = mSet.add(new Member("CCC",30));
		System.out.println(bool);
		System.out.println(mSet);
		
		bool = mSet.add(new Member("BBB",30));
		System.out.println(bool);
		System.out.println(mSet);

	}

}
