package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_07 {

	public static void main(String[] args) {
		
		EmpSQL sql = new EmpSQL();
		List<EmpVO> list = sql.exam_07(20, 30);
		
		for(EmpVO a : list) {
			System.out.println(a.getEname()+"\t"+a.getDno());
		}
		
	}

}
