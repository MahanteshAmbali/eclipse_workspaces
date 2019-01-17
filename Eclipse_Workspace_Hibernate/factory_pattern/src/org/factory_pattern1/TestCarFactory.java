package org.factory_pattern1;

import java.util.Scanner;

public class TestCarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter cartype as (LUXURY, SEDAN, HATCHBACK");
		String carTypeInput = scanner.next();
		
		switch (carTypeInput) {
		case "LUXURY":
			System.out.println(CarFactory.buildCar(CarType.LUXURY));
			break;

		case "SEDAN":
			System.out.println(CarFactory.buildCar(CarType.LUXURY));
			break;
			
		case "HATCHBACK":
			System.out.println(CarFactory.buildCar(CarType.LUXURY));
			break;
			
		default:
			break;
		}
	}

}
