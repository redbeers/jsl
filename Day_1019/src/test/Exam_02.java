package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
	private int sno;
	private String sname;
	
	public Student() {}
	public Student(int i, String string) {
		this.sno=sno;
		this.sname=sname;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			
			return(sno == student.sno)&&(sname.equals(student.sname));
		} else {
			return false;
		}
	}
//	@Override
//	public int hashCode() {
//	
//		return sname.hashCode()+sno;
//	}
}
public class Exam_02 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student,Integer>();
		map.put(new Student(1,"홍길동"),100);
		map.put(new Student(5,"홍사동"),88);
		map.put(new Student(3,"홍이동"),75);
		map.put(new Student(2,"홍삼동"),90);
		map.put(new Student(9,"홍오동"),95);
		map.put(new Student(7,"홍치동"),70);
		map.put(new Student(1,"홍지동"),100);
		
		
//		1.키보드로 번호, 이름, 점수 임력
//		Map에 저장된 객체를 찾아서 출력 객체없는경우 등록된자요없음
		Scanner s = new Scanner(System.in);
		while(true) {
		String jum = s.nextLine().trim();//trim은 공백을 지워준다 실수로 입력시 보완
		if(!map.containsKey(jum)) {//Map에 저장된 내용없으면 출력
			System.out.println("등록된자료 없음");
			continue;
			}
		}

		//2.점수 합계를 구하여 출력
		
		
		
		//3.점수의 최대값, 최소값을 찾아서 출력
	}

}
