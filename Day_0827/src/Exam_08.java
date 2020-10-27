import java.util.Scanner;

/*	3개의 정수를 입력 받아서 대, 중, 소 출력
 * 1. 입력자료는 1 ~ 100상이의 범위 내에 있어야 한다.
 * 2. 일력예시
 * 		입력자료 : 70 0 90
 * 		입력오류입니다.
 * 		입력자료 : 70 85 90
 * 		max:90 med=85 min=70
 * 		입력자료 : 40 78 40
 * 		입력오류입니다.
 * 
 */
public class Exam_08 {

	public static void main(String[] args) {
		//1.입력자료가 1~100 동일한 값을 없을 경우
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수입력 :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();


		if(a<b) {
			int imsi =a; a=b; b=imsi;
		}
		if (a<c) {
			int imsi=a; a=c; c=imsi;
		}
		if(b<c) {
			int imsi=b; b=c; c=imsi;
		}
		

		System.out.println("max :" +a+ "\tmid :" +b+ "\tmin" +c);


		System.out.println("============================");
		
		int max, med, min;
		if(a>b) {
			if (a>c) {
				max=a;
				if (b>c) {
					med=b; min=c;
				}else {
					med=c; min=b;
				}
			}else {
				max=c;
				med=a;
				min=b;
			}
		}else {
			if(b>c) {
				max=b;
				if(a>c) {
					med=a;
					min=c;
				}else {
					med=c; min=a;
				}
			}else {
				max=c;
				med=b;
				min=a;
			}
		}
		System.out.println("max:"+max+"\tmed:"+med+"\tmin"+min);
		

	}

}







