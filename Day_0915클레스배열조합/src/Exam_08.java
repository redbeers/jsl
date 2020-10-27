import java.util.Scanner;
public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student[] stu = new Student[100];
		System.out.print("학생입력 :");

		int cnt=0;
		int num = scn.nextInt();
		String name = scn.next();
		int kor = scn.nextInt();
		int mes = scn.nextInt();
		int eng = scn.nextInt();
		
		stu[cnt]= new Student(num,name,kor,mes,eng);
		cnt++;
	
		
		}
	for(int x=0; x<cnt; x++) {
		stu[x].stuPint();
	}
	

}
