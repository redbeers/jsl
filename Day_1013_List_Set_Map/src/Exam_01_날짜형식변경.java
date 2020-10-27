import java.text.DecimalFormat;
//책 541쪽
public class Exam_01_날짜형식변경 {

	public static void main(String[] args) {
		int a=123456789;
		DecimalFormat df = new DecimalFormat("¤#E0");
		String  d=df.format(a);
		System.out.println(d);
		try {
		Number ss=df.parse(d);
		System.out.println(ss);
		}catch(Exception e) {}
	}

}
