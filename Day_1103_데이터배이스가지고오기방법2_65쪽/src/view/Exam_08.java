package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_08 {

	public static void main(String[] args) {
		
		EmpSQL sql = new EmpSQL();
		List<EmpVO> list = sql.exam_08(20, 30);
		
		for(EmpVO emp : list) {
			System.out.println(emp.getEname()+"\t"+emp.getSalary()+"\t"+emp.getDno());
		}

	}

}
