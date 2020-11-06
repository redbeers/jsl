package view;

import java.util.List;

import db.EmpSQL;
import vo.EmpVO;

public class Exam_04 {

	public static void main(String[] args) {
		EmpSQL sql = new EmpSQL();
		List<EmpVO> list = sql.exam_04(7788);
		for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i).getEname() + "\t");
		System.out.println(list.get(i).getDno());
		}

	}

}
