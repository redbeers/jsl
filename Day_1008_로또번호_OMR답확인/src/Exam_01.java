import java.io.File;
import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\tkdql\\JAVA\\Eclips_Workspaces\\Day_1008\\src\\grade\\data.txt"));
			String data = null;
			System.out.print("번호\t이름\t");
			for(int x=1; x<=20; x++) {
			System.out.print(x+"\t");
			}
			System.out.println("총점");
			
//			while((data=sc.nextLine())!=null){
				while(sc.hasNext()) { 
					data=sc.nextLine();
					String[] stu = data.split(",");
					int tot =0;
					int cunt = 2;
					int[] dam=new int[20];
					for(int x=0; x<20; x++) {
						dam[x]=Integer.parseInt(stu[cunt]);
						cunt++;
					}
					for(int x=0; x<dam.length; x++) {
						tot+=dam[x];
					}
				
				for(int x=0; x<stu.length; x++) {
					System.out.print(stu[x]+"\t");
				}
				
				System.out.println(tot);
			}
			
		}catch(Exception e) {
			System.out.println("오류");
		}
	}

}
