import java.util.Scanner;
public class Exam_01문제포함최대_최소구하기 {

	public static void main(String[] args) {
//		System.out.println("01==============");
//		int [] arr;
//		arr = new int[5];//할당 0~4번까지 출력가능 자동초기화된다.  
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[4]);
//		System.out.print(arr.length);//몇개를 할당했지 확인할때 
//		
//		System.out.println("02==============");
//		char [] cha = new char[5];
//		cha[0] = 'A';
//		cha[1] = 66;
//		cha[2] = 'C';
//		cha[3] = 'D';
//		cha[4] = 'E'+1;
//		
//		System.out.println("cha[0] :" + cha[0]);
//		System.out.println("cha[1] :" + cha[1]);
//		System.out.println("cha[2] :" + cha[2]);
//		System.out.println("cha[3] :" + cha[3]);
//		System.out.println("cha[4] :" + cha[4]);
//		System.out.println("+++++++++++");
//		for(int x=0; x<cha.length; x++) {
//			System.out.println("cha["+x+"]:" + cha[x]);
//		}
//		System.out.println("=================");
//		for(int x=0; x<5; x++) {
//			System.out.print("cha["+x+"]:" + cha[x]);
//			System.out.println();
//			
//	 	}
//		System.out.println("03==========");
//
//		int[] arr = new int[5];// 자동초기화0
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		System.out.print(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
//		int[] a = { 10, 20, 30, 40, 50 };
//		System.out.print(a);
//
//		System.out.println("04=================");
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int sum=0;
//		for(int x=0; x<arr.length; x++) {//length는 지금 할당한 층이 몇개인지 확인할때 사용한다.
//			System.out.print(arr[x]+" ");
//			sum +=arr[x];	
//		}
//		System.out.println();
//		System.out.println(sum);
//
//
//		
//		System.out.println("05=================");
//		//키보드로 정수를 입력받아서 배열에 저장 후 출력
//		//입력자료의최대 갯수는 10이내
//		//입력 자료에 -99가 있으면 죵료한다.
//
//		Scanner scn = new Scanner(System.in);			
//		int [] arr = new int[10];
//		int count=0;
//		System.out.print("정수입력");
//		while(count<10) {
//			int a = scn.nextInt();
//			if(a==-99)
//				break;
//			arr[count] = a;
//			count++;
//		}
//		System.out.println("입력자료 출력");
//		for(int x=0; x<count; x++) {
//			System.out.print(arr[x] + " "); 
//		}
//
//		System.out.println("06=================");
//		
//		키보드로 1~10 사이 정수 7개를 입력 배열에 저장후
//		최대, 최소를뺀 나버지 합계를 구하여 출력
//		 1. 1~10 이외 수는 "오류" 출력
//		 2. 입력 형식
//		    정수 : 1 2 3 4 5 6 7 8 9 10
//		 3. 출력형식
//		    입력자료 : 1 2 3 4 5 6 7 
//			  최대 : 7
//		    최소 : 1
//		 합계(최대-최소) : a-최대-최
//
		int[] a = new int[7];
		Scanner scn = new Scanner(System.in);
		System.out.println("정수입력");
		for (int x = 0; x < a.length; x++) {
			int y = scn.nextInt();
			if (y < 1 || y > 10) {
				System.out.println("오류");
				x--;
				continue;
			}	
		}
			int max = 1;
			int min = 0;
			int sum = 0;
			for (int x1 = 0; x1 < a.length; x1++) {
				sum += a[x1];
				if (max <= a[x1])
					max = a[x1];
				if (min >= a[x1])
					min = a[x1];
				
			}
			System.out.print(sum+" ");
			System.out.print(max+" ");
			System.out.println(min);
//			System.out.println(max - min);
		
		

//		System.out.println("입력자료 :");
//		int [] a = new int[7];
//		for(int x=0; x<a.length; x++) {
//			System.out.print(a[x] + "\t");
//			x++;
//		}
//		int max = 1;
//		int min = 10;
//		int sum = 0; 
//		for(int x=0; x<a.length; x++) {
//			sum += a[x];
//			if(max<=a[x])
//				max=a[x];
//			if(min>=a[x])
//				min=a[x];
//		
//		System.out.print(max);
//		System.out.println(min);
//		System.out.println(max-min);
//		}
		
		
		
		
		
//		System.out.println("07===============");
//		int [] a = new int[7];
//		Scanner scn = new Scanner(System.in);
//		System.out.println("정수입력");
//		
//		int cnt=7;
//		while(cnt<7) {
//			int a = scn.nextInt();
//			if(a<10 || a>100) {
//				System.out.println(a + "값은 오류");
//				continue;
//			}
//			a[cnt]=a;
//			cnt++;
//		}
//			
//		System.out.println("입력자료 :");
//		for(int x=0; x<a.length; x++) {
//			System.out.print(a[x] + "\t");
//		}
//		
		
		
//		System.out.println("08================");
//		//정수배열 10개가 선언되어있다.
//		//키보드로 10진수를 입력 받아서 2진수로 변환해서 출력
//		
//		int bin[] = new int[10];
//		int a = 25; // 10진수 입력
//		int cnt = 0;
//		int m = a;
//		do {
//			int n = m % 2;   //n=1
//			bin[cnt] = n;  // bin의 cnt를 n 
//			m = m / 2;// m=0.08
//			cnt++;// cnt=1
//		} while (m != 0);
//		System.out.println("10진수 :" + a);
//		System.out.print("2진수 :" );
//		for (int x = cnt-1; x >= 0; x--) {
//			System.out.print(bin[x] + " ");
//		}
//		

//
//		System.out.println("09================");
//		//키보드로 10진수 입력 2, 8, 16진수로 변환
//		//10진수  : 25
//		//변환 : 2
//		//10진수25는 2진수 11001 이다.
//
//		//10진수 : 25
//		//변화 : 16
//		//10진수 25는 1ㅅ6진ㄴ수 19 이다.
//		
//		char ch[] = {'0','2','3','4','5','6','7','8','9','A','B','C','D','F'};
//			int val = 78; //10진수 입력
//			int con = 2; //변환
//			int mok = val;//몫
//			int na; //머지
//			String str= "";
//			do {
//				na =mok % con; //나머지 계산
//				str= ch[na]+str;
//				mok = mok/con;//몫계산
//			}while(mok != 0);
//			System.out.println("10진수 " +val+" 2진수 " +
//			con + " 몫 "+ val + " 나머지 " + na);
//
//		
//		System.out.println("10===========");
		
		/*	int[] arr = {21,12,13,34,35,67,87,43,21,34}
		 * 	평균에 가장 가까운 값을 찾아서 출력
		 * 	출력 형식 
		 * 	정수 : 21,12,13,34,35,67,87,43,21,34
		 * 	평균 : xx
		 * 평균에 가장 가까운 값 :?? 
		 */
//		int[] arr = {21,12,13,34,35,67,87,43,21,34};
//		int a=arr;
//		int sum=0;
//		int muk=0;
//		for(int x=0; x<arr.length; x++) {
//		System.out.print(arr[x]+("\t"));
//		
//		sum = sum+arr;
//		}
//		
		
	}
}