package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpSQL emp = new EmpSQL();
		List<EmpVO> list = emp.exam_02(12);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEname()+"\t");
			System.out.print(list.get(i).getSalary()+"\t");
			System.out.println(list.get(i).getSum()+"\t");
		}

	}

}
