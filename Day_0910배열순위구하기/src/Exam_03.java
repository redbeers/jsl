/*	검색
 * 	1. 선형 검색
 * 	2. 2진 검색(정렬)
 * 
 */
public class Exam_03 {

	public static void main(String[] args) {
		int data[] = {1,2,3,4,5,6,7,8,9,3};
		int search=3; //검색
		boolean bool = true;
		System.out.print(search + "는");
		for(int x=0; x<data.length; x++) {
			if(data[x] == search ) {
				System.out.print(x + "번째있음");
				bool=false;
				//break;
			}
		}
		if(bool) {
			System.out.print("없음");
		}

	}

}
