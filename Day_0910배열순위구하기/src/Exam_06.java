import java.util.Scanner;

public class Exam_06 {
	static int data[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

	public static void main(String[] args) {

	static int search(int val) {
		int low = 0;
		int high = data.length - 1;
		while (low <= high) {
			int m = (low + high) / 2;
			if (data[m] == val) {
				return m;
			}
			if (data[m] < val) {
				low = m + 1;
			} else {
				high = m - 1;
			}
		}
		return -1;
	

	Scanner scn = new Scanner (System.in);

	while(true)
	{
		System.out.print("찾는 값(1~100) :");
		int val = scn.nextInt();
		System.out.println(mid + "번째");

	}if(val==-99)
	{
		System.out.println("프로그램을 종료합니다.");
		System.exit(1);

	}if(val<1||val>100)
	{
		System.out.println("입력값 범위오류");

		continue;
	}
	int pass = search(val);if(pass==-1)
	{
		System.out.println(val + "값은없음");
	}else
	{
		System.out.println(val + "값은" + pass);
	}
	}
}}}
