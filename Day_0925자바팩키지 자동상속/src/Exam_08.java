/* String
 * 
*/ 
public class Exam_08 {
	public static void name() {
		
		String str = "AAA";
		String str1 = new String();
		byte[] by= {65,66,67,88};
		String byStr = new String(by);
		
		String str2 = new String ("BBB");
	
		System.out.println("=============");
		String st1="AAA";
		String st2="AAA";
		String st3=new String("AAA");
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		if(st1.equals (st3)) {
		System.out.println("==");
		}else {
			System.out.println("!=");
		}
	}
}
