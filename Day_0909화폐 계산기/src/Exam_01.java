/*	키보드로 금액을 입력 화폐단위별매수 계산
 * 
 */
public class Exam_01 {

	public static void main(String[] args) {
		int pay = 178958;//금액 입력된 경우
		int  money = 50000;
		boolean bool = true;
		for(int x=1; x<=10; x++) {
			if (bool) {
				System.out.print(money + " : ");
				int mok = pay/money;
				System.out.print(mok);
				pay = pay % money;
				money = money /5;
				bool = false;
			}else {
//				System.out.print(money + " : ");
//				int mok = pay/money;
//				System.out.println(mok);
//				pay = pay % money;
				money = money / 2;
				bool = true;
			}
		}

	}

}
