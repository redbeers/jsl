@FunctionalInterface
interface MyFunc{
	public void methdo();
}
public class Exam_03 {
	public static void main(String[] args) {
		MyFunc mf = null;
		
		mf=()->{
			String str ="sdfg";
			System.out.println(str);
		};
		mf.methdo();
		
		mf=()->{
			System.out.println("adsfasdflkjlkj");
		};
		mf.methdo();
		
		mf=()->System.out.println("xcm,zdsfklh");
		mf.methdo();
	}
}
