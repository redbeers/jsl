package interfaace1;

public class ActoinExam {
	public static void main(String [] a) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
				
			}
		};
		action.work();
	
	}
}
