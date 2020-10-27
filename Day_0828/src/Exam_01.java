import java.util.Scanner;

/*	번호, 이름, 국어, 영어, 수학 점수를 입력 다음과 같이 출려
 * 	입력예시
 * 자료입력:1 홍길동 90 90 35
 * 
 * 출력예시
 * 번호	이름	총점	평균	판정
 * 1	홍길동	215	71.67	과락
 * 
 * 처리조건
 * 1. 평균은 소수 2째자리까지 출려(3째자리에서 반올림)
 * 2.판정은세과목 모두 40이상이고 평균 60이상이면 "합격"
 * 3.세과목 모두 40이상이나 평균이 60미만이면 "합격"
 * 4. 평균은 60이상이나 한과목이라도 40미만이면 "과락"
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.print("자료입력 :");
		//System.out.println("번호입력");
		int n = scanner.nextInt();
		//System.out.println("이름입력");
		String na = scanner.next(); //글자는 String으로 받고 next로 입력한다.
		//System.out.println("국어점수입력");
		int k = scanner.nextInt();
		//System.out.println("영어점수입력");
		int e = scanner.nextInt();
		//System.out.println("수학점수입력");
		int m = scanner.nextInt();

		int max = k+e+m;
		
		System.out.println();
		
		*/
		
		System.out.println("자료입력 :");
		int bun = scanner.nextInt();
		String name = scanner.next();
		int kor = scanner.nextInt();
		int mat = scanner.nextInt();
		int eng = scanner.nextInt();
		
		int tot = kor+eng+mat;
		//소수점이하 둘째자리까지 계산
		double ave = ((int)(tot/3.*100+0.5))/100.;
		String panjung="";
		if(kor>=40 && eng>=40 && mat>=40) {
			if(ave>=60) {
				panjung = "합격";
			}else {
				panjung = "평균미만";
			}
		}else {
			panjung ="과락";
		}
		System.out.println("번호\t이름\t총점\t평균\t판정");
		System.out.println(bun+"\t"+name+"\t"+tot+"\t"+ave+"\t"+panjung);
		
		
	}

}
