package org.factory_pattern;

import java.util.Scanner;

public class TestCarFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.MEDIUM));
		System.out.println(CarFactory.buildCar(CarType.SMALL));*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter car type as(LUXURY, SEDAN, SMALL): ");
		String carTypeInput = scanner.next();
		switch (carTypeInput) {
		case "LUXURY": System.out.println(CarFactory.buildCar(CarType.LUXURY));
						break;

		case "SEDAN": System.out.println(CarFactory.buildCar(CarType.MEDIUM));
		break;

		case "SMALL": System.out.println(CarFactory.buildCar(CarType.SMALL));
		break;

		
		default: System.out.println("ENTER VALID CARTYPE: ");
			break;
		}
	}
}
