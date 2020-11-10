package view;

import EmpDAO.EmpDAO;
import EmpVO.EmpVO;

public class Exam_02 {

	public static void main(String[] args) {
		int bno = 1234;
		String name = "김학생";
		String job = "STUDENT";
		int manager = 7698;
		
		EmpVO vo = new EmpVO();
		vo.setEno(bno);
		vo.setEname(name);
		vo.setJob(job);
		vo.setManager(manager);
		
		EmpDAO m =EmpDAO.getInstance();
		int row = m.exam_02_1(vo);
		if(row == 1) {
			System.out.print("성공");
		}else {
			System.out.print("실패");
		}

	}

}
