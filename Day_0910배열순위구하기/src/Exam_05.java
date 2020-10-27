import java.util.Scanner;

/*	data[] 배역에 정수가 n오름차순으로 정렬되어 있다.
 * 	키보드로 찾을값을 입력하면 위치를 찾아 되돌려주는 메소드를 만들어라
 * 	출력하는 츠로그램 작성
 * 	1. 찾고자하는 값의 범위는 1~100이어야 한다. (범위이외의 갑이 입력되면 "입력오류 처리")
 * 	2. 입력예시
 * 	찾는 값입력(1~100) : 77
 * 	찾는 값 77는 없습니다.
 * 	찾는 값입력(1~100) : 30
 * 	찾는 값 30는 4번째 있습니다.
 * 찾는 값입력(1~100) : -99
 * 	프로그램을 종료합니다.
 */
public class Exam_05 {

	public static void main(String[] args) {
		int data[] = {10,20,30,40,50,60,70,80,90};
	Scanner scn = new Scanner (System.in);
	
	while(true) {
		System.out.print("찾는 값(1~100) :");
		int val = scn.nextInt();
//		int low =0;
//		int high = data.length-1;// data갯수 에서 -1
//		
//		while(low <= high) {
//			int mid = (low+high)/2;
//			if(data[mid] == val) {
//		System.out.println("내가 하던거");
		
				System.out.println(mid + "번째");
				
			}
		}
		if(val ==-99) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(1);
		}
		if(val<1 || val >100) {
			System.out.println("입력값 범위오류");
			
			continue;
		}
		int pass = search(data.val);
		
	}

	}

}
