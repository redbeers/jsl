package Test_01;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int bun;
	private String name;
	private int score;
	
	public Student() {}
	public Student(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {//toString은 문자열로 표시한다.
		return bun + "\t" +name +"\t"+score;
	}
	//메서드 생성
	public void dataSort(List<Student> list) {
		for(int x=0; x<list.size()-1; x++) {
			for(int y=x+1;y<list.size(); y++) {
				Student s1 = list.get(x);
				Student s2 = list.get(y);
				if(s1.bun>s2.bun) {
					list.set(x, s2);
					list.set(y, s1);
				}
			}
		}
	}
//	public int getBun() {
//		return bun;
//	}
//	public void setBun(int bun) {
//		this.bun = bun;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getScore() {
//		return score;
//	}
//	public void setScore(int score) {
//		this.score = score;
//	}
	
}
public class Exam_04_이름_번호_나이오름차순정렬 {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		
		sList.add(new Student(1,"AAA",80));
		sList.add(new Student(5,"BBB",70));
		sList.add(new Student(3,"CCC",95));
		sList.add(new Student(7,"DDD",85));
		sList.add(new Student(2,"EEE",77));
		//1전체 자료 출력
		for (int i = 0; i < sList.size(); i++) {
			Student st = sList.get(i);
			System.out.println(st);
		}
		System.out.println();
		// 번호를 기준으로 오름차순출력
		// 메서드 생성후 마무리작업
		Student st = new Student();
		for (int i = 0; i < sList.size(); i++) {
			st.dataSort(sList);
			st = sList.get(i);
			System.out.println(st);
		}
	}
}
