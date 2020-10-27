import java.util.Scanner;

public class Exma_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("a=");
		int a=scn.nextInt();
		System.out.print("b=");
		int b=scn.nextInt();
		System.out.print("c=");
		int c=scn.nextInt();
		
		System.out.println(a + "," + b + "," + c);//가장 작은 값을 찾을때
		int dow = (a<b)?a:b;
		dow = (dow<c)?dow:c;
		System.out.println("dow :" + dow);
		
	}

}
