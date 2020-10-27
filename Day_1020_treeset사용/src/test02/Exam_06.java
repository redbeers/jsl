package test02;

import java.util.*;



/* 키보드로 번호 ,이름, 점수를 입려받아서 학생객체를 생서TreeSet 저장후 출력
 * 입력:1,홍익이,98
 * 입력:8,아이잉,76
 * -=======
 * 입력:0 -> 출력 후 종료
 * 동일번호 입력시 "이미 등록된 변호입니다." 경고출력
 * 
 * 출력(번호 순으로 출력)
 * 번호  이름  점수
 * ++++++++
 * 총점 xxx
 * 평균 xx.xx
 * 최대점수 학생
 * 번호 : xx 이름 : xx 점수 :xxx
 * 최소점수 학생
 * 번호 : xx 이름 : xx 점수 :xxx
 * 
 */
class Student {

	private int bun;
	private String name;
	private int jum;
	
	
	public Student () {}
	Student(int bun, String name, int jum) {
		this.bun=bun;
		this.name=name;
		this.jum=jum;
	}
	@Override
	public String toString() {
		
		return "번호 "+bun+"이름 "+name+"점수 "+jum;
	}
	
	
}
public class Exam_06 {

	public static void main(String[] args) {
		TreeSet<Student> tset = new TreeSet<Student>();
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
		String hs =sc.next();
		String[] sdate = hs.split(",");
		
		int tbun = Integer.parseInt(sdate[0]);
		String tname = sdate[1];
		int tjum = Integer.parseInt(sdate[2]);
		
		int mxa = 0;
		int min =101;
		
		Student stu = new Student();
		tset.add(new Student(tbun, tname, tjum));
		System.out.println(tset);
		}
//		Iterator<Student> si = 

	}
}
