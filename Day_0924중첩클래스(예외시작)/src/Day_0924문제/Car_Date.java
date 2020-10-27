package Day_0924문제;

import Day_0924문제.Car.Tira;

public class Car_Date {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		Tira tire = myCar.new Tira();
		tire.disp_in();
		Car.Engine engine =new Car.Engine();
		engine.disp_in();

	}

}
