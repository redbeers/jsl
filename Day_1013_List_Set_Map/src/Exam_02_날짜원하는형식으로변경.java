import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_02_날짜원하는형식으로변경 {

	public static void main(String[] args) {
		Date today = new Date();//현재 날짜를 today에 저장한다.
		
		SimpleDateFormat sd1,sd2,sd3,sd4,sd5, sd6, sd7, sd8,sd9;
		sd1 = new SimpleDateFormat();
		sd2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		sd3 = new SimpleDateFormat("YYYY-MM dd HH:mm:ss.SSS");
		sd4 = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss a");
		
		sd5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sd6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sd7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sd8 = new SimpleDateFormat("올늘은 이 달의 W 번째 주입니다.");
		sd9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		
		System.err.println(today);
		System.out.println(sd1.format(today));
		System.out.println(sd2.format(today));
		System.out.println(sd3.format(today));
		System.out.println(sd4.format(today));
		System.out.println(sd5.format(today));
		System.out.println(sd6.format(today));
		System.out.println(sd7.format(today));
		System.out.println(sd8.format(today));
		System.out.println(sd9.format(today));
		
		
	}

}
