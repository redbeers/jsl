//싱글톤
class DD {
	int x = 100;
	
	private DD() {}
	private static DD intstance =new DD();
	
	public static DD aa() {
		return intstance;
	}
}


public class Exam_05 {

	public static void main(String[] args) {
//		DD d1 = new DD();
//		DD d2 = new DD();

		DD d1 = DD.aa();
		DD d2 = DD.aa();
		if (d1==d2) {
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
		if(d1.equals(d2)) {
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
	}

}
