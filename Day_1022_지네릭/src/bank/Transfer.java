package bank;
//계좌이체를 수행하는 스레드
public class Transfer extends Thread{
	SharedArea sharedArea;
	public Transfer(SharedArea area) {
		sharedArea = area;
	}
	@Override
	public void run() {
		for(int cnt=0; cnt<12; cnt++) {
			synchronized (sharedArea) {//동시에일어나게해준다.동기화코드블럭
				sharedArea.account1.withdraw(100);
				System.out.println(sharedArea.account1.ownerName + "100만원 인출 "+sharedArea.account1.balance);
				sharedArea.account2.deposit(100);
				System.out.println(sharedArea.account2.ownerName + "100만원 지급 "+sharedArea.account2.balance);
			}
		}

	}
}
