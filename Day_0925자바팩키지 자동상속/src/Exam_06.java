import java.util.Arrays;

//clone() : 자신을 복제하여 새로운 인스턴스(일회용)를 만든다.
public class Exam_06 {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60};
		int b[] = new int [a.length];
		
		for(int x=0; x<a.length; x++) {
			b[x] =a[x];
		}
		int c[] = a.clone();
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(c));
		String [] str = {"aaa", "bbb","ccc"};
		String [] str2 = str.clone();
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
	}

}
