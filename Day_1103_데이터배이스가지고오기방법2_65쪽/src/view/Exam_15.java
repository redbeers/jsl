package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_15 {

	public static void main(String[] args) {
		EmpSQL sql = new EmpSQL();
		List<EmpVO> list = sql.exam_15(500);
		
		for(EmpVO emp : list) {
			System.out.println(emp.getEname()+
					"\t"+emp.getSalary()+
					"\t"+emp.getCommission());
		}

	}

}
