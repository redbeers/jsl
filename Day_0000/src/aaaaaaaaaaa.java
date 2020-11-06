import java.util.Scanner;

public class aaaaaaaaaaa {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] d = sc.nextLine().split("");
		int sum = 0;
		for(int i=0; i<a; i++) {
			sum +=Integer.parseInt(d[i]);
		}
		System.out.println(sum);
    }

}
