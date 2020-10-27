abstract class DD{
	int m,n;

	public DD(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public void print() {
		System.out.println("m=" + m + "\tn=" + n);
	}

	public abstract int add();
	public abstract void mul();
}

class DDD extends DD {
	
	
	public DDD(int m, int n) {
		super(m, n);
		
	}
	@Override
	public int add() {
		int s = 0;
		for(int x=m; x<n; x++) {
			s+=x;
		}
		
		return s; 
		
	}
	@Override
	public void mul() {
		int s=1;
		for(int x=m; x<=n; x++) {
			s*=x;
		}
		System.out.println("s="+s);
	}
}  

public class Exam_03 {
 
	public static void main(String[] args) {
		DDD ddd = new DDD(1,5);
		ddd.m=5;
		ddd.n=10;
		int s = ddd.add(); 
		System.out.println("s =" + s);
		ddd.mul();
	}

}
