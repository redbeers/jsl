package student;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

/* [입력 파일로부터 입력]
 * c:/data/student.txt 파일내용 예시
 * 1,ㅁㅁㅁ,90,89,78
 * ===
 * [출력-1 입력받은 순서대로 출력]
 * 번호  이름  국어  영어  수학 총점  평균  석차
 * LinkedHashSet
 * [출력-2 석차를 기준으로 오름차순 출려]
 * 번호  이름  국어  영어  수학 총점  평균  석차
 * 
 * 처리조건
 * -번호와 이름이 같으면 "중복된 자료입니다."
 * 
 */
public class Studant_in {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\tkdql\\JAVA\\Date\\student.txt"));
		LinkedHashSet<Student> set = new LinkedHashSet<Student>();
		int cnt = 0;
		int samecnt = 0;
		boolean bool = false;
		while (sc.hasNextLine()) {
			String str[] = sc.nextLine().split(",");
			int bun = Integer.parseInt(str[0]);
			String name = str[1];
			int kor = Integer.parseInt(str[2]);
			int eng = Integer.parseInt(str[3]);
			int mat = Integer.parseInt(str[4]);
			int tot = kor + eng + mat;
			double ave = Math.round(tot * 100. / 3) / 100.;
			bool = set.add(new Student(bun, name, kor, eng, mat, tot, ave));
			if (!bool) {
				samecnt++;
			}
			cnt++;
		}
		List<Student> list = new ArrayList<Student>(set);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setRank(i + 1);
		}

		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for (Object obj : set) {
			System.out.println(obj);
		}
		System.out.println("입력자료 총 수: " + cnt);
		System.out.println("중복된 자료 수: " + samecnt);
		System.out.println();

		System.out.println(" ** 석차를 기준으로 오름차순 출력 ** ");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
