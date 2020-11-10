package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> list = dao.exam_01(7788);
		
		for(EmpDTO a : list) {
			System.out.println(a.getEname()+"\t"+a.getJob());
		}
	}

}
