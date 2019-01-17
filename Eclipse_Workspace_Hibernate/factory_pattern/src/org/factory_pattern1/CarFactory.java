package org.factory_pattern1;

public class CarFactory {

	public CarFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Car buildCar(CarType model){
		Car car = null;
		
		switch (model) {
		case LUXURY:
			car = new LuxuryCar();
			break;

		case SEDAN:
			car = new SedanCar();
			break;

		case HATCHBACK:
			car = new HatchBackCar();
			break;

		default:
			return null;
		}
		
		return car;
	}
}
