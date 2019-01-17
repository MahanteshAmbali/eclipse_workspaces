package org.factory_pattern1;

public class HatchBackCar extends Car{

	public HatchBackCar() {
		// TODO Auto-generated constructor stub
		super(CarType.HATCHBACK);
	}
	
	@Override
	public void buildCar(CarType model) {
		// TODO Auto-generated method stub
		System.out.println("Building HATCH BACK CAR");
	}
}
