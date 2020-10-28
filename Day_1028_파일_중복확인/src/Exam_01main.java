import java.io.*;
import java.util.*;
/* - 입력 번호 이름 점수(3)
 * - 0입력시 종료
 * - 동인조건시 "이미 등록된 번호입니다."
 * 
 * 출력
 * 번호  이름  국어  영어  수학  총점  평균  학점
 * 						 00.00
 * 
 * 학점
 * 평균 90A, 80B, 70C, 60D, 60이하F
 * 
 * 1입력 -> 학생등록
 * 2입력 -> 전체 출력
 * 3입력 -> 종료
 */
class Student implements Comparable<Student>{
	private int bun;
	private String name;
	private int k;
	private int e;
	private int m;
	private int t;
	private double a;
	public Student() {}
	public Student(int bun, String name,int k, int e,int m) {
		this.bun=bun;
		this.name=name;
		this.k=k;
		this.e=e;
		this.m=m;
		t = k+e+m;
		a = t/3;
	}
	@Override
	public String toString() {
		
		return bun+"\t"+name+"\t"+k+"\t"+e+"\t"+m+"\t"+t+"\t"+a;
	}
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(bun, o.bun);
	}
	
}
public class Exam_01main {
	static Scanner sc = new Scanner(System.in);
	public static void add(List list) {
		System.out.print("등록: ");
		String str[] = sc.nextLine().split(",");
		list.add(new Student(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),Integer.parseInt(str[4])));
	}
	
//	try {
//		File f =  new File("C:\\Users\\tkdql\\JAVA\\Date\\student1028.dat");
//		FileOutputStream fos = new FileOutputStream(f);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
//		ObjectOutputStream oos = new ObjectOutputStream(bos);
//		
//		}catch (IOException ffe){
//			ffe.printStackTrace();
//		}
	public static void main(String[] args) {
		
	}

}
