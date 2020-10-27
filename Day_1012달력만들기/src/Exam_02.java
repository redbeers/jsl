import java.util.Calendar;

/* calendar : 인터페이스
 * 월은 0월부터시작한다.
 * 
 */
public class Exam_02 {

	public static void main(String[] args) {
		Calendar sal = Calendar.getInstance();
		int year = sal.get(Calendar.YEAR);
		int month = sal.get(Calendar.MONTH)+1;
		int date = sal.get(Calendar.DATE);
		int t=sal.get(Calendar.AM_PM);
		int tt=sal.get(Calendar.HOUR);
		int m=sal.get(Calendar.MINUTE);
		System.out.print(year+"년 "+month+"월 "+date+"일 "+tt+"시"+m+"분");
	}

}
