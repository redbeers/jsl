package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_03 {

	public static void main(String[] args) {
		EmpSQL sql =new EmpSQL();
		List<EmpVO> list = sql.exam_03(2000); 
		
		for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i).getEname()+"\t");
		System.out.print(list.get(i).getSalary()+"\t");
		System.out.println();
		}
	}

}
