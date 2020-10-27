package sawon;

import java.io.*;
import java.util.*;

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
class Person {
	private String name;
	private String tel;
	private int age;

	public Person() {
	}

	public Person(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	@Override
	public String toString() {
		return name+"\t"+tel+"\t"+age;
	}
}

public class Exam_05 {

	static Scanner sc = new Scanner(System.in);

	public static void add(List list) {
		System.out.print("등록: ");
		String str[] = sc.nextLine().split(",");
		list.add(new Person(str[0], str[1], Integer.parseInt(str[2].trim())));
	}

	public static void print(List list) {
		System.out.println("이름\t전화\t나이");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void exit(List list) {
		try {
			File f = new File("C:\\Programming\\JSL\\JAVA\\Date\\student.txt");
			FileOutputStream fos = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream obs = new ObjectOutputStream(bos);
			obs.writeObject(list);
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		} finally {
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		try {
			File f = new File("/Users/uneko/data/student.dat");
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			Object obj = ois.readObject();
			List list = (List) obj;

			while (true) {
				System.out.print("1.등록, 2.전체보기, 3.종료 :");
				int select = sc.nextInt();
				sc.nextLine();

				switch (select) {
				case 1:
					add(list);
					break;
				case 2:
					print(list);
					break;
				case 3:
					exit(list);
					break;
				default:
					System.out.println("잘못된 값입니다.");
					break;
				}

			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		}

	}

}