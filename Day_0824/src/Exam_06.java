//printf()//서식지정 출력
//서식문자%nd:10정수, %n.sf:실수,%nc:문자, %ns:문자열
// %n은 자리수를 넣을자리
public class Exam_06 {

	public static void main(String[] args) {
		System.out.printf("정수%d\n" , 100);
		System.out.printf("정수%10d\n" , 100);
		System.out.printf("정수%-10d\n" , 100);
		
		//System.out.printf("정수%d %10d %-10d\n" , 100,200,300);
		System.out.printf("정수%o %x %-10d\n" , 10,10,10);
	}

}
