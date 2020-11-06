package exam;


import sql.EmpSQL;

public class DBTest {
	
	public static void main(String[] args) {
		EmpSQL sql = new EmpSQL();
		String name = "SCOTT";
//		sql.exam_01(1500);
//		sql.exam_02(name);
//		String jj = "MANAGER"//둘달사용가능
//		
//		sql.exam_03(10,"MANAGER");//^^^^^
		sql.exam_05("F");
	}
}
