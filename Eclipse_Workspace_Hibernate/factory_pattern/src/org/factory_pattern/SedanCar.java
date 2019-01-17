package org.factory_pattern;

public class SedanCar extends Car{

	public SedanCar() {
		// TODO Auto-generated constructor stub
		super(CarType.MEDIUM);
		constructCar();
	}
	
	@Override
	public void constructCar() {
		// TODO Auto-generated method stub
		System.out.println("Building SedanCar");
	}
}
