/*	반복문
 * 	for	: 반복횟수가 일정할경우
 * 	형식
 * 	for([1]초기값; [2]반복저건식; [4]증감식){
 * 		[3]문장1;
 * 		}
 * 	for(int x=1; x<=5; x++){
 * 		system.out.print("x");
 * 		}
 * ===============================================
 * 	while : 참이면 출력
 * 	
 * while(조건식){
 * 		[1]문장;
 * 	}
 *  int x=1;
 *  while(x<=5;{
 *  system.out.print("x")
 *  x++;
 *  }
 * 	do~while : 
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		//System.out.println("*");
	//	int x=1;
		for(int x=1; x<=5; x++) {
			System.out.println("*");
		}
		//System.out.println(x);
		
		int s=0;
		int a=1;
		while(a<=10) {
			System.out.print(a);
			s +=a;
			a++;
			
		}
		System.out.println(s);
	}

}
