//지네릭 타입으로 는 설계도만 사용한다.
class Person<T,M>{
	T kind;
	M model;
	
	public T getkind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	public void setKind(T kind) {
		this.kind=kind;
	}
	public void setModel(M model) {
		this.model=model;
	}
}
class Tv{
	
}
class Car{
	
}
public class Exam_02 {

	public static void main(String[] args) {
		Person<Tv, String> p = new Person<Tv,String>();
		p.setKind(new Tv());
		p.setModel("삼성");
		
		p.getkind();
		p.getModel();
		
		Person<Car, Tv> p2 = new Person<Car,Tv>();
	}

}
