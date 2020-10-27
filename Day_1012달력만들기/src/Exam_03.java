import java.util.Calendar;
import java.util.GregorianCalendar;

/* 그래고리력
 * GregorianCalendar
 * 
 */
public class Exam_03 {

	public static void main(String[] args) {
		GregorianCalendar gc =new GregorianCalendar(2010,11,1);	
		System.out.print(gc.get(Calendar.YEAR));
	}

}
