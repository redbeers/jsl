import java.util.Scanner;
/* 키보드로 번호, 이름, 나이 입력 배열에 저장 후 출력(최대10명이내)
 *  [입력형식]
 *  등록 :1 이학생 28
 *  등록 :5 김학생 30
 *  등록 :2 박학생 25
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Student[] hak = new Student[10];
		int cnt =0;
		while (cnt<10) {
			System.out.print("학생등록");
			int bun = scn.nextInt();
			if (bun==-99) {
				break;
			}
			String name = scn.next();
			int age = scn.nextInt();
			Student student = new Student(bun,name,age);
			hak[cnt]= student;
			cnt++;
		}
		System.out.println("입력자료 출력 - ");
		System.out.println("번호\t이름\t나이\t");
		for (int x=0; x<cnt; x++) {
			System.out.print(hak[x].bun +"\t");
			System.out.print(hak[x].name+"\t");
			System.out.println(hak[x].age+"\t");
		}
	}

}
