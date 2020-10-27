import java.util.Scanner;
//Ctrl+Shift+o 
//scanner 클래스 이용
//번호, 이름, 국어, 영어, 수학점수 입력
public class Exam_04 {

	public static void main(String[] args) {		
		Scanner scn = new Scanner(System.in);//글자입력 방법 
		int bun, kor, eng, met;
		String name;
		System.out.print("번호 :");
		bun = scn.nextInt();
		System.out.print("이름:");
		name = scn.next();
		System.out.print("국어 :");
		kor= scn.nextInt();
		System.out.print("영어 :");
		eng= scn.nextInt();
		System.out.print("수학 :");
		met= scn.nextInt();
		
		int tot = kor + eng + met;
		double ave = tot/3;
		System.out.println("번호 :" + bun);
		System.out.println("이름:" + name);
		System.out.println("총점 :" + tot);
		System.out.println("평균 :" + ave);
	}

}
