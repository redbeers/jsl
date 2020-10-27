package test02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 키보드로 사원 아이디, 이름, 나이를 입력받아서 사원 객체르르 생성 set에 저장 후 출력
 * 1. 입력 형식
 * 사원등록 : aaa,김사원,23
 * ======
 * 2. 출력 형식
 * 아이디   이름   나이
 * ======
 * 3.처리조건
 * 동일한 사원(아이디)일 경우 "중복된 아이디입니다."재입력
 * 사원아이디가 end이면전체 사원 추력 후 종료
 * 
 */
class Sawon{
	private String id;
	private	String name;
	private int age;
	
	public Sawon() {}
	public Sawon(String id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString() {//원하는 형식으로 출력해준다
		return "아이디\t"+id+"\t이름"+name+"\t나이"+age;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Sawon) {
			Sawon s = (Sawon)obj;
			return s.name.equals(name)&&s.age==age;
		}else {
			return false;
		}
	}
	
}

public class Exam_08 {
	
	public static void main(String[] args) {
		Set<String> sSet = new HashSet<String>(); 
		Sawon s = new Sawon();
		
		
		

	}

}
