import java.util.Calendar;
import java.util.Scanner;

public class Exam_04 {
	static void time(int a, int b) {
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년입력");
		int year = sc.nextInt();
		System.out.print("월입력");
		int month = sc.nextInt();
		int START_DAT_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year,month-1, 1);
		eDay.set(year,month, 1);
		
		eDay.add(Calendar.DATE,-1);
		
		START_DAT_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		System.out.println("    "+year+"년 "+ month+"월");
		System.out.println(" SU MO TU WE TH GR SA");
		
		for(int i=1; i<START_DAT_OF_WEEK; i++) {
			System.out.print("   ");
		}
		for(int i=1, n=START_DAT_OF_WEEK; i<=END_DAY; i++,n++) {
			System.out.print((i<10)? "  "+i : " "+i);
			if(n%7==0)System.out.println(); 
		}
		
		
		
	
		
		
	}

}
