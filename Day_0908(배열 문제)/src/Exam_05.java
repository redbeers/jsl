/*	키보드로 n개의 데이터를 입력 배역에 저장하는 프로그램 작성
 * 	1. 배역의 쵀대 갯수는10
 * 	2. 입력 자료에 -99는 입력 자료의 끝이다.
 * 
 */
import java.util.Scanner; 
public class Exam_05 {
	
	static void print(int[] var, int cnt) {
		System.out.println("입력자료 출력;");
		for(int x=0; x<cnt; x++) {
			System.out.print(var[x]+"\t");
		}	
	}
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int[] var = new int[10];
	int cnt=0;
	System.out.print("정수입력 :");
	while(cnt<10) {
		int a = scn.nextInt();
		if(a==-99) {
			break;
		}
		var[cnt]=a;
		cnt++;
	}
	print(var, cnt);
	
//	System.out.println("입력자료 출력;");
//	for(int x=0; x<cnt; x++) {
//		System.out.print(var[x]+"\t");
//	}

	}

}
