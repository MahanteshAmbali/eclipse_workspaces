package org.factory_pattern;

public class SmallCar extends Car{

	public SmallCar() {
		// TODO Auto-generated constructor stub
		super(CarType.SMALL);
	}
	
	@Override
	public void constructCar() {
		// TODO Auto-generated method stub
		System.out.println("Building SmallCar");
	}
}
