
public class Exam_중첩지우기 {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		while(true) {
			a = (int)(Math.random()*9)+1;
			if(a != b) {
				break;
			}
		}
		while(true) {
			
			if(a > 10) {
				break;
			} else if(a % 2 == 1) {
				a++;
				continue;
			}
			
			System.out.println(a++);
			
		} 

	}

}
