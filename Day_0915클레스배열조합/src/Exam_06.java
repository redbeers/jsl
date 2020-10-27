import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int [][] sak = new int[100][5];
		String name[] = new String[100];
		double[] ave = new double[100];
		String by[] = new String[100];
		int cnt = 0;
		while(cnt<100){
			System.out.print("학생입력 :");
			sak[cnt][0] = scn.nextInt();
			if(sak[cnt][0]==-99) {
				break;
			}
			name[cnt] = scn.nextInt();
			sak[cnt][1] = scn.nextInt();
			sak[cnt][2] = scn.nextInt();
			sak[cnt][3] = scn.nextInt();
			
			sak[4]=sak[cnt][1]+sak[cnt][2]+sak[cnt][3];
			ave[cnt]=sak[t][4]
		}
		
	}

}
