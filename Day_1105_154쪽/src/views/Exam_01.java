package views;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		EmpDTO emp = dao.exam_01();
		
		System.out.println(emp.getMax());
		System.out.println(emp.getMin());
		System.out.println(emp.getSum());
		System.out.println(emp.getRound());

	}

}
