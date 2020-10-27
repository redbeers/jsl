package interface2;

public class DaoExam {
	private static void dbWork(DataAccessObjext dao) {
	//
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
	}
	
	public static void main(String[] aaa) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}

/*  실행 결과
 * Dracle DB에서 검색
 * Dracle DB에 삽입
 * Dracle DB를 수정
 * Dracle DB에서 삭제
 * MySql DB에서 검색
 * MySql DB에 삽입
 * MySql DB를 수정
 * MySql DB에서 삭제
 * 
 */  
