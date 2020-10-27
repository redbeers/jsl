package sawon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 키보드 이름 전화 나이 입력 Person 객체를 생성 txt파일로 출력
 * 입력형식
 * [1] 등록
 * [2] 전체보기(화변출력)
 * [3] 종료
 * 메뉴 선택 [1~3]
 * 
 * [1] 선택시
 * 등록 홍길동,010-1111-1111,28
 * 
 * [2] 선택시
 * 이름  전화  나이
 *  ..  ..  ..
 * 
 */
class Person  {
	String man;

	public Person() {
	}

	public Person(String man) {
		this.man=man;
	}
	@Override
	public String toString() {

		return man;
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<Person>();
		File f = new File("C:\\Users\\tkdql\\JAVA\\Date\\person.txt");
		while(true) {
			System.out.print("번호입력");
			int in = sc.nextInt();
			if(in == 1) {
				System.out.print("등록 :" );
				String sawon = sc.nextLine();
				Person p = new Person(sawon);
			
			}
		}
	}
}
