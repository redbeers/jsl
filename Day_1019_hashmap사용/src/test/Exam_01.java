package test;

import java.util.HashMap;
import java.util.Map;

class AA {
	int bun;
	String name;
	
	AA(){}
	AA(int bun, String name){
		this.bun=bun;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AA) {
			AA aa = (AA) obj;

			return (bun == aa.bun) && (name.equals(aa.name));
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		
		return name.hashCode()+bun;
	}
	
}
public class Exam_01 {

	public static void main(String[] args) {//사용자가만든클래스는 주소가다르다
		Map<AA, Integer> aMap = new HashMap<AA,Integer>();
		aMap.put(new AA(1,"김학생"),95);
		aMap.put(new AA(5,"이학생"),88);
		aMap.put(new AA(1,"김학생"),90);
		
		System.out.println(aMap.size());

	}

}
