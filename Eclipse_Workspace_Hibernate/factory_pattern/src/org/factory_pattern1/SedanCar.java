package org.factory_pattern1;

public class SedanCar extends Car{

	public SedanCar() {
		// TODO Auto-generated constructor stub
		super(CarType.SEDAN);
	}
	
	@Override
	public void buildCar(CarType model) {
		// TODO Auto-generated method stub
		System.out.println("Bulding SEDAN CAR");
	}
}
