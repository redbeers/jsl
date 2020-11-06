package view;

import java.util.List;

import dao.EmpDAO;
import vo.EmpVO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO DAO = EmpDAO.gatInstance();
		List<EmpVO> list = DAO.exam_01();
		
		for(EmpVO emp:list) {
			System.out.println(emp.getStype()+"\t"
					+emp.getStype2());
		}

	}

}
