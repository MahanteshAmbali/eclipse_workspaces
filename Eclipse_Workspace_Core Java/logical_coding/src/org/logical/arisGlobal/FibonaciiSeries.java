package org.logical.arisGlobal;

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range: ");
		int range = scanner.nextInt();
		
		int fib1 = 0, fib2 = 1, fib3;
		System.out.println(fib1);
		System.out.println(fib2);
		
		for (int i = 2; i < range; i++) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
		}
	}

}
