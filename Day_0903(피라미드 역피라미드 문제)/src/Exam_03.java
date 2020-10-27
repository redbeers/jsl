/*	다중 반복 구
 * 
 */
public class Exam_03 {

	public static void main(String[] args) {
	for(int x=1; x<=10; x++) {//10번돌
		System.out.print(x);
		for(int  y=1; y<=x; y++) {//50번돈다
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("================");
	
	for(int x=1; x<=10; x++) {//10번돌
		System.out.print(x);
		for(int  y=10; y>=x; y--) {//50번돈다
			System.out.print("*");
		}
		System.out.println();
	}
	
System.out.println("================");
	
	for(int x=1; x<=10; x++) {//10번돌
		System.out.print(x);
		for(int  y=1; y<=(11-x); y++) {//50번돈다
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
