package test02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



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

public class Exam_06_Treeset_학생점수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Student> sSet = new TreeSet<Student>();
		boolean bool = false;
		while(true) {
			System.out.print("번호,이름,점수 입력: ");
			String str[] = sc.nextLine().split(",");
			if(str[0].equals("0")) break;
			int num = Integer.parseInt(str[0]);
			String name = str[1];
			int score = Integer.parseInt(str[2]);
			bool = sSet.add(new Student(num, name, score));
			if(!bool) {
				System.out.println("이미 등록된 번호입니다.");
			}
		}
		System.out.println("번호\t이름\t점수");
		Set set = sSet;
		Iterator iter = set.iterator();
		int size = set.size();
		int sum = 0;
		Student sst = sSet.last();
		Student bst = sSet.first();
		
		while(iter.hasNext()) {
			Student st = (Student)iter.next();
			sum += st.getScore();
			if(sst.getScore() > st.getScore()) 
				sst = st;
			if(bst.getScore() < st.getScore())
				bst = st;
			
			System.out.println(st);
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (Math.round(sum*100./size)/100.));
		System.out.println("\n최대 점수 학생");
		System.out.println("번호 : " + bst.getNum() + "\t이름 : " + bst.getName() + "\t점수 : " + bst.getScore());
		System.out.println("\n최소 점수 학생");
		System.out.println("번호 : " + sst.getNum() + "\t이름 : " + sst.getName() + "\t점수 : " + sst.getScore());
	}


		

	}

