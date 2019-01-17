package org.factory_pattern1;

public abstract class Car {

	private CarType model = null;
	public Car(CarType model) {
		// TODO Auto-generated constructor stub
		this.model = model;
	}
	
	public abstract void buildCar(CarType model);

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
	
}
