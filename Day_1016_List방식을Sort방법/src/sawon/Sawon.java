package sawon;

public class Sawon implements Comparable<Sawon>{
	//compareTo사용하기 위해서는 Comparable<클래스 이름>사용해야한다.
	private int sbun;
	private String name;
	private int age;

	public Sawon() {
	}

	public Sawon(int sbun, String name, int age) {
		this.sbun = sbun;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return sbun + "\t" + name + "\t" + age;
	}

	@Override
	public int compareTo(Sawon o) {
		//사원 벊호에따라 오름차순으로 나타낸다.
		//vvvv오름차순 방법
		if (sbun < o.sbun) {// 오름차순
			return -1;
		} else if (sbun == o.sbun) {
			return 0;
		} else {
			return 0;
		}
	}
}
