package views;

import java.util.List;

import domain.EmpDTO;
import mapper.EmpDAO;

public class Exam_02 {

	public static void main(String[] args) {
		EmpDAO dao =EmpDAO.getInstance();
		List<EmpDTO> list = dao.exam_03(10);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getDno()+"\t");
			System.out.print(list.get(i).getJob()+"\t");
			System.out.println(list.get(i).getLoc()+"\t");
		}
	}

}
