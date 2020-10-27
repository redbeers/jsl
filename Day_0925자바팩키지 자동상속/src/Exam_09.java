
public class Exam_09 {

	public static void main(String[] args) {
		String str = "korea - seoul in jslhrd";
		//문자열 길이 length() 글자 수를 알기우이해 사용 공백도 한글자
		System.out.println(str.length());

		for(int x=0; x<str.length(); x++) {
			System.out.println(str.charAt(x));
		}
	}

}
