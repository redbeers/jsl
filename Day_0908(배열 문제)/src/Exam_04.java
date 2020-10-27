/*	메서드 호
 * 
 */
public class Exam_04 {
	//두 수를 교환하는 메서드 작성
	static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=a;
	}
	static void swap2(int[] test) {
		int temp = test[0];
		test[0]=test[1];
		test[1]=temp;
	}
	public static void main(String[] args) {
		int a= 100, b=200;
		System.out.println("교환:" + a+ "="+a+"\td="+b);
		swap(a,b);
		System.out.println("교후:" + a+ "="+a+"\td="+b);
		int var[] = {100,200};
		System.out.println("교환: var[0]" + "="+var[0]+"\td="+var[1]);
		swap2(var);
		System.out.println("교후: var[0]" + "="+ var[0] +"\td=" + var[1]);
	}

}
