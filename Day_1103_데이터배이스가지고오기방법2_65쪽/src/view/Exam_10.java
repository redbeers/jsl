package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_10 {

	public static void main(String[] args) {
		
		EmpSQL sql = new EmpSQL();
		List<EmpVO> list = sql.exam_10("null");
		
		for(EmpVO emp : list) {
			System.out.println(emp.getEname()+"\t"+emp.getJob());
		}
	}

}
