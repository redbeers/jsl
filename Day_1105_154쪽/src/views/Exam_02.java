package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> list = dao.exam_02();
		
		for(EmpDTO emp : list ) {
			System.out.println(emp.getJob()+"\t"+emp.getMax()+"\t"+
		emp.getMin()+"\t"+emp.getSum()+"\t"+emp.getRound());
		}
	}

}
