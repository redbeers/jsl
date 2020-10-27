class Box<a>{//타입을정해줄수있다.안전성이보장된다.
	String f;
	int d;
	Object obj;
	a oobj;
	Box(a obj){
		this.obj=obj;
		
	}
}
class AA{
	
}
public class Exam_01 {

	public static void main(String[] args) {
		
		Box b = new Box(new String());
		

	}

}
