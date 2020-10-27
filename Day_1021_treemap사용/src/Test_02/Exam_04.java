package Test_02;

import java.util.*;

/* 키보드로 번호,이름 점수를 받아 학생객체(번호 이름 )을 생성 TreeMap으로 저장후 출력
 * 입력
 * 1,ㅁㅁㅁ,94
 * 4,ㄱㄱㄱ,90
 * 
 * 종료 0
 * 
 * 조건
 * 동일번호시 이미있다
 * 
 * 출력 
 * 번호 이름 점수
 * 
 * 총점
 * 평균
 * 
 */
class Student implements Comparable<Student>{
	private int bun;
	private String name;
	
	public Student() {}
	public Student(int bun, String name) {
		this.name=name;
		this.bun=bun;
	}
	@Override
	public String toString() {
		
		return bun+" :"+name;
	}
	
	@Override
	public int compareTo(Student o) {
		//bun과bun을 비교해주는부분 Comparable을 샤용해줘야한다.
		return Integer.compare(bun, o.bun);
	}
		
	
}
public class Exam_04 {

	public static void main(String[] args) {
		
		TreeMap<Student, Integer> tmap = new TreeMap<Student, Integer>();
		Scanner sc= new Scanner(System.in);
		boolean bo = false;
		//TreeMap(tmap)에 넣어주는 과정
		while (true) {
			System.out.print("in :");
			String[] stu = sc.nextLine().split(",");
			//String 타입으로 입력받는다.
			if (stu[0].equals("0"))
				break;
			
			int bun = Integer.parseInt(stu[0]);
			//int형식으로 String 티입을 넣는다.
			String name = stu[1];
			int score = Integer.parseInt(stu[2]);
			//int형식으로 String 티입을 넣는다.
			
			if(bo) {
				//??????????????????????????
				Student stuoberlap = new Student(bun,name);
				bo = tmap.containsKey(stuoberlap);
				if(bo) {
					System.out.println("이미존재함");
					continue;
				}
			}
			tmap.put(new Student(bun,name),score);
			//tmap이라는 TreeMap에 넣어준다.
			bo = true;
			//??????????????????
		}
		System.out.println("번호\t이름\t점수");
		Set<Student> set = tmap.keySet();
		//TreeMap에들어간 tmap을 Set방식으로 변환해준다.
		Iterator it = set.iterator();
		//Set에 들어간 TreeMap을 Iterator 형식으로 변환한다. 
		int sum = 0;
		
		while(it.hasNext()) {//it에 다음이 있으면 식행한다.
			Student stu = (Student)it.next();
			//Student클래스에있는 메소드를 사용하기 위해stu에 넣어준다.
			sum +=tmap.get(stu); 
			//??????????????????????
			System.out.println(stu+"\t"+tmap.get(stu));
			//?????????????????????
		}
		System.out.println("총점 >"+sum);
		System.out.println("평균 >"+sum*100./tmap.size()/100.);
		
	}

}
