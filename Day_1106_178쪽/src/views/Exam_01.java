package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_01 {

	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> list = dao.exam_01("SCOTT");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getEname());
			System.out.print(list.get(i).getDno());
			System.out.println(list.get(i).getDanme());
		}
		
	}

}
