import java.util.Scanner;

//키보드로 점수를 입력 받아서 점수가 80이상이면 "합격"
//아니면 "불합격" 출력
public class Exma_03 {

	public static void main(String[] args) {
		/*Scanner scn = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score = scn.nextInt();
		String str = (score>=80)?"합격":"불합격";
		System.out.println("점수:" + score + "는" + str);
*/
		Scanner scn = new Scanner(System.in);
		System.out.print("a=");
		int a=scn.nextInt();
		System.out.print("b=");
		int b=scn.nextInt();
		System.out.print("c=");
		int c=scn.nextInt();
		
		
/*		System.out.println(a + "," + b + "," + c);//가장 큰 값을 찾을때
		int up = (a>b)?a:b;
		up= (up>c)?up:c;
		System.out.println("up :" + up);
*/		
		System.out.println(a + "," + b + "," + c);//가장 작은 값을 찾을때
		int dow = (a<b)?a:b;
		dow = (dow<c)?dow:c;
		System.out.println("dow :" + dow);
		
		//int max=(a>b)?a:b;
		//int min=(a<b)?a:b;
		
		
	}

}
