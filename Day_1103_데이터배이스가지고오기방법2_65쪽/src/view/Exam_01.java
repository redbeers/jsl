package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpSQL sql = new EmpSQL();
		List<EmpVO> list = sql.exam_01(300);
		
		for(int x=0; x<list.size();x++) {
			System.out.print(list.get(x).getEname()+"\t");
			System.out.print(list.get(x).getSalary()+"\t");
			System.out.print(list.get(x).getSum()+"\t");
			System.out.println();
		}
	}

}
