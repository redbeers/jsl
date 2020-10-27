import java.util.Scanner;

public class ParkingExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Parking[] car = new Parking[100];
		int cnt = 0;
		while (cnt < 100) {
			System.out.print("주차정보 :");
			int carin = scn.nextInt();
			if (carin == 0000) {
				break;
			}
			int carNO = scn.nextInt();
			int parkTime = scn.nextInt();
			int money = scn.nextInt();
			if (money == 0) {
				System.out.print("무료");
				
				if (parkTime < 10) {
					money = 0;
				}
//parkTime 이 30분을 넘어가면 나누기 10을해준후 10당 money에 500원추가
				if (parkTime <= 30) {
					money=500;
					if(parkTime>30) {
						parkTime = parkTime/10;
						}
					}

//money가 30,000이 넘어가면 money-30,000원을 해주고 30,000원만 money에남긴다.
				Parking parking = new Parking(carNO, parkTime, money);
				car[cnt] = parking;
				cnt++;

			}
		}
		System.out.println("자동차번호\t주차시간\t주차요금");
		for (int x = 0; x < cnt; x++) {
			System.out.print("\t" + car[x].carNO + "\t");
			System.out.print(car[x].parkTime + "\t");
			System.out.println(car[x].money + "\t");
		}
	}

}