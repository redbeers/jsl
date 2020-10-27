//메소드 오버로딩
class AA{
	public void add(int a, int b) {
		
	}
    public int add(int a, double b) {
		
    	return 0;
	}
    public void add(int a, int b, int c) {
		int s=a+b+c;
	}
    //가변인자
    public void add2(int ... a) {
		int s=0;
		for (int x=0; x<a.length; x++) {
			s+=a[x];
		}
		System.out.println(s);
    }
    public void add3(int[] a) {
		int s=0;
		for (int x=0; x<a.length; x++) {
			s+=a[x];
		}
		System.out.println(s);
    }
}
public class Exam_03 {

	public static void main(String[] args) {
		AA a = new AA();
		a.add(1, 2);
		a.add(1, 2, 3);
		a.add2(1, 2, 3, 4,5,6,7,8,9,10);
		int[] s= {1,2,3,4,5,6,7};
		a.add3(s);

	}

}
