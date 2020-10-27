package bank;
//계좌이체와 잔액 합계를 동시에 수행한 프로그램


public class AccountExam {

	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111","김이사========",1500);
		area.account2 = new Account("222-222","김비서",100);		

		Transfer thread1 = new Transfer(area);
		PrintThread thread2 = new PrintThread(area);
		
		thread1.start();
		thread2.start();
		
	}

}
