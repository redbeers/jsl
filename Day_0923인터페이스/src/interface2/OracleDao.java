package interface2;

public class OracleDao implements DataAccessObjext {

	@Override
	public void select() {
		System.out.println("Oracle Do에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle Do에 삽입");

	}

	@Override
	public void update() {
		System.out.println("Oracle Do를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Oracle Do에서 삭제");

	}

}
