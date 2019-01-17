package org.factory_pattern;

public class CarFactory {

	public static Car buildCar(CarType model){
		
		Car car = null;
		switch (model) {
		case LUXURY:
			car = new LuxuryCar();
			break;
		
		case MEDIUM:
			car = new SedanCar();
			break;
			
		case SMALL:
			car = new SmallCar();
			break;
			
			
		default:
			break;
		}
		return car;
	}
}
