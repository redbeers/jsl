import java.util.Scanner;

/*	각 사원의 아이디(id), 등급, 근무시간을 입력받아 사원들에 대한 주간 급여를 계산하는 프로그램을 완성하시오
 * 1) 입력항목
 *    아이디, 등급, 근무신간
 * 2) 출력항목
 *    아이디, 등급, 시급, 근무시간, 주간급여
 *    
 * 3)처리조건
 *  - 사원의 주간급여는 근무시간과 시급을 곱한 값으로 한다.
 *  - 시급은 사원의등급이 1등급인 경우 10,000원, 2등급인 경우 5,000원, 3등급인경우 2,000원으로 한다.
 *  근무시간이 36시간을 초과한 경우 초과근무시간에 대해 시급의 1.5배를 지급하며, 근무시간은 최대 50시간까지만 인정된다.
 * 
 */
public class Exam_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 :");
		String id = scan.next();
		System.out.println("등급을 입력하세요 :");
		int d = scan.nextInt();
		System.out.println("근무시간을 입력하세요 :");
		int t = scan.nextInt();
		
		int pay=0;
		if(d==1)
			pay = 10000;
		else if(d==2)
			pay = 5000;
		else if(d==3)
			pay = 2000;
		
		int pays=0;
		
		int po = 50;
		int ab = 0;
		
		if(t>0 && t<=36) {
			pays = pay * t;
		}else if(t>36 && t<=50) {
				ab = t-36;
				ab = ((int)((ab*pay)*1.5));
				pays = pay * 36;
				
				pays = ab + pays; 
				
		}	
		else if(t>50)
				pays = po;
		
		System.out.println("아이디\t등급\t시급\t근무시간\t주간급여");
		System.out.println(id + "\t" + d + "\t" + pay + "\t" + t + "\t" + pays);
		//주간은 t*pay  아이디, 등급, 시급, 근무시간, 주간급여
	}

}
