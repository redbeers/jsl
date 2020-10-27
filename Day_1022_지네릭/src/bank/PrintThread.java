package bank;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	PrintThread(SharedArea area) {
		sharedArea=area;
	}
	
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {
			synchronized (sharedArea) {//동시에일어나게해준다.동기화코드블럭
				int sum = sharedArea.account1.balance + sharedArea.account2.balance;
				System.out.println("계좌잔액합계 :" + sum);
				try {
					Thread.sleep(2);
				} catch (Exception e) {
				}
			}
		}
	}

}
