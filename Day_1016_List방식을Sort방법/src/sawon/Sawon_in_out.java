package sawon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/* 키보드로 사원번호, 이름, 나이를 입력 받아서 Set에 저장
 * 사원번호를 기준으로 오름차순 출력하는 프로그램 작성
 * 1. 입력형식
 * 사원등록 :1101,ㅁㅁㅁㅁ,23
 * =======
 * 2출력형식
 * -사원 목록-
 * 사원번호  이름    나이
 * 1101  aaaa   23
 * ======
 * -사원 번호순-
 * 사원 번호   이름      나이
 * 1101    ㅁㅁㅁㅁ   23
 * 3.처리조건
 * -사원번호 중복시 이미등록된 사원입니다. 출력
 * -사원번호9999이면 출력 종료
 * 
 */
public class Sawon_in_out {

	public static void main(String[] args) {
		Set<Sawon> setS = new HashSet<Sawon>();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(true){
			String str = sc.next();
			if(str.equals("9999")) {
				break;
			}
			String[] sData = str.split(",");
			if(sData.length != 3) {
				System.out.println("입력값을 다시 확인해주세요. (입력 개수 오류)");
				continue;
			}
			
			int bun = Integer.parseInt(sData[0]);
			String name = sData[1];
			int age = Integer.parseInt(sData[2]);
			int check = 0;
			
//			if(cnt > 0) {
//				for (int j = 0; j < setS.size(); j++) {
//					List<Sawon> lset = new ArrayList<Sawon>(setS);
//					if(lset.get(j).getBun() == bun) {
//						check = 1;
//					}
//				}
//			}
//			
//			if(check == 1) {
//				System.out.println("이미 등록된 사원입니다.");
//				continue;
//			}
//			
			
			boolean bool = setS.add(new Sawon(bun, name, age));
			System.out.println(bool);
			cnt++;
		}
		System.out.println();
		List<Sawon> lset = new ArrayList<Sawon>(setS);
		
		System.out.println("** 사원 목록 **");
		System.out.println("사원번호\t이름\t나이");
		for (int i = 0; i < lset.size(); i++) {
			System.out.println(lset.get(i));
		}
		System.out.println();
		System.out.println("** 사원 번호순 **");
		Collections.sort(lset);//순서정렬
		for (int i = 0; i < lset.size(); i++) {
			System.out.println(lset.get(i));
		}

	}

}
