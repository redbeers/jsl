/*	키보드로 금액을 입력 화폐단위별매수 계산
 * 
 */
public class Exam_02 {

	public static void main(String[] args) {
		int money[] = {50000, 10000, 5000,1000, 500,100,50,10,5,1};
		int pay = 178958;//금액 입력된 경우
		for(int x=0; x<money.length; x++) {
				System.out.print(money[x] + " : ");
				int mok = pay/money[x];
				System.out.println(mok);
				pay = pay % money[x];
		}

	}

}
