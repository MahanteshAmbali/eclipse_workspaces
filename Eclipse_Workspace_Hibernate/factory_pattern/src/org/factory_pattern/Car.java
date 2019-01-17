package org.factory_pattern;

public abstract class Car {

	private CarType model = null;
	public Car(CarType model) {

		this.model = model;
		constructCar();
	}
	
	public abstract void constructCar();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
}
