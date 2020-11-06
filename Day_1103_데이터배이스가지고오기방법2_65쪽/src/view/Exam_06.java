package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_06 {

	public static void main(String[] args) {
		EmpSQL sql = new EmpSQL();
		List<EmpVO>list = sql.exam_06("81/02/20","81/05/01" );
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEname()+"\t");
			System.out.print(list.get(i).getJob()+"\t");
			System.out.println(list.get(i).getHiredate());
		}
		

	}

}
