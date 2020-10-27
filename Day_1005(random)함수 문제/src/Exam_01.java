/* 동적인 문자열 처리 클래스
 * stringBuffer 멀티 :자동으로 16자리만듬, 16자이상이면 자동으로공간늘어남(16바이트씩)
 * StringBuilder 싱글
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer(10);
		str1.append("Korea");
		str1.append("1234567890");

		System.out.println(str1.capacity());
		System.out.println(str1.length());
		str2.append("123456789012345678901234567");
		System.out.println(str2.capacity());
		System.out.println(str2.length());

	}

}
