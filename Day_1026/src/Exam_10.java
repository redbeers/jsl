import java.io.*;
import java.util.Scanner;

/* 키보드로 번호, 이름 국어 영어ㅓ 수학 입력 평균 총점 구하기
 * [입력]
 * 입력:1,김학생,90,90,90
 * 
 * -99입력 종료
 * 
 * 출력
 * hakexam.txt
 * 번호  이름  국어  영어  수학  총점  평균
 *  1 김학생  90  90  90  270  90
 *  
 */
public class Exam_10 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		File f = new File("C:\\Users\\tkdql\\JAVA\\Date\\hakjum.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		while (true) {
			System.out.print("입력: ");
			String str[] = sc.nextLine().split(",");
			if (str[0].equals("-99"))
				break;
			int sum = 0;
			for (int i = 2; i < str.length; i++) {
				sum += Integer.parseInt(str[i]);
			}
			double ave = Math.round(sum*100./3)/100.;
			
			for(int i=0; i<str.length; i++) {
				pw.print(str[i] + "\t");
			}
			pw.println(sum + "\t" + ave);
		}
		pw.close();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
	}

}








