package org.factory_pattern;

public class LuxuryCar extends Car{

	public LuxuryCar() {
		// TODO Auto-generated constructor stub
		super(CarType.LUXURY);
		constructCar();
	}

	@Override
	public void constructCar() {
		// TODO Auto-generated method stub
		System.out.println("Building LuxuryCar");
	}
}
