
public class Exam_01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("제조사 :" + car1.company);
		System.out.println("제조사 :" + car1.cc);
		System.out.println("제조사 :" + car1.speed);
		System.out.println("제조사 :" + car1.starting);
		
		car1.company="현대자";
		car1.cc = 2000;
		car1.speed = 0;
		
		car1.startOn();
		car1.speedUp();		
	}
}
