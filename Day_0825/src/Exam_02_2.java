/* 문자열을 사용할때
 * String
 */
public class Exam_02_2 {

	public static void main(String[] args) {
		char name = '홍';
		String na = "홍길동";
		int kor = 100;
		int eng = 95;
		int mat = 77;
		int tot = kor + eng + mat;
		double ave = tot/3;
		System.out.println("이름 :" + name);
		System.out.println("총점 :" + tot);
		System.out.println("평균 :" + ave);

	}

}
