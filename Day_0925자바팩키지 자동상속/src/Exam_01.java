/* 자바 팩키지
 * Object 모든 클래스에 Object가 자동 상속된다
 * 
 */


class AA{
	int x=10;
	
	public boolean equals (Object ob) {
		if (ob instanceof AA) {
			AA a = (AA)ob;
			return x == x.a;
		}else {
		return false;
		}
	}
}
public class Exam_01 {

	public static void main(String[] args) {
		//Object obj = new Object();
		
		AA a1 = new AA();
		AA a2 = new AA();
		System.out.println(a1);//여기랑
		System.out.println(a2);//여기가 주소가 다르다
		
		if(a1==a2) {
			System.out.println("a1 == a2");
		}else {
			System.out.println("a1 != a2");
		}
		if(a1.equals(a2)) {
			System.out.println("동일");
			
		}else {
			System.out.println("다름");
		}
		
	}

}
