/* 2짐검색
 * 2 진검색은 정렬이 되어있어야한다.
 * 
 */
public class Exam_04 {

	public static void main(String[] args) {
		int[] data = { 10, 20, 30, 40, 50, 80, 99 };
		int search = 30;
		int low =0;
		int high=data.length-1;//6 data 의 총 개수에서-1
		int sw = 0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(data[mid] == search) {
				System.out.println(mid + "번째");
				sw=1;
				break;
			}
			if(data[mid]<search) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(sw==0) {
			System.out.println("없다.");
		}
	}

}
