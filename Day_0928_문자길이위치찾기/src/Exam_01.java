
public class Exam_01 {

	public static void main(String[] args) {
		String str="HRD_korea#Java_SpringFramework";
		//문자열 길이
//		for(int x=0; x<str.length(); x++) {
//			char ch = str.charAt(x);
//			System.out.println(ch);
//		}
//		str=str.concat("123456789");
//		System.out.println(str);
		
		//문자열 위치 
		//int x=str.indexOf("S");//첫번째만 찾는다.
		int x=str.indexOf("S",5);//5번째부터 찾는다.
		System.out.println(x);
		
	}

}
