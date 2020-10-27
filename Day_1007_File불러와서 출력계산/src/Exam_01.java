import java.io.File;
import java.util.Scanner;

/* c:/data/studen.tht 파일내용
 * 5,이학생,90,80,90,90,99
 * 
 * 출력
 * 번호  이름  국어  영어  수학  화학  전산  총점  평균
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		try {
		Scanner sc =  new Scanner(new File("C:\\Users\\tkdql\\JAVA\\data\\student.txt"));
		String data = null;
		System.out.println("번호\t이름\t국어\t영어\t수학\t화학\t전산\t총점\t평균");
//		while((data=sc.nextLine())!=null) {
			while(sc.hasNext()) {
				data=sc.nextLine();
			String[] stu = data.split(",");
		
			int jum1=Integer.parseInt(stu[2]);
			int jum2=Integer.parseInt(stu[3]);
			int jum3=Integer.parseInt(stu[4]);
			int jum4=Integer.parseInt(stu[5]);
			int jum5=Integer.parseInt(stu[6]);
			int tot = jum1+jum2+jum3+jum4+jum5;
			double ave = (int)(tot/5.*100+0.5)/100;
			
			System.out.print(stu[0]+"\t"+stu[1]+"\t"+jum1+"\t"+jum2+"\t"+jum3+"\t"+jum4+"\t"+jum5+"\t"+tot+"\t"+ave);
			System.out.println();
			
		}
		}
		catch(Exception e) {
			System.out.println("파일없음");
		}
	}

}
