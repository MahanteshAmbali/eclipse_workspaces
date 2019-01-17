package org.factory_pattern1;

public class LuxuryCar extends Car{

	public LuxuryCar() {
		// TODO Auto-generated constructor stub
		super(CarType.LUXURY);
	}
	
	public void buildCar(CarType model) {
		// TODO Auto-generated method stub
		System.out.println("Bulding LUXURY CAR");
	}
}