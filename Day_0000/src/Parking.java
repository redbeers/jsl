public class Parking {

//	String carNO;
	int carNO;
	int parkTime;
	int money;
	
	public Parking(int carNO, int parkTime, int money ) {
		this.carNO = carNO;
		this.parkTime = parkTime;
		this.money = money;
	}
	public void parkingExam () {
		System.out.print(carNO + "\t"+parkTime);
		System.out.println("\t"+money);
	}
}
