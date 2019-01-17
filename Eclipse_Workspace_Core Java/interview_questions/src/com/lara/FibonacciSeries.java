package com.lara;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int fibRange, fFib = 0, sFib = 1, tFib = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fibonacci range to generate: ");
		fibRange = sc.nextInt();
		
		loopFibonacci(fibRange);
		for (int i = 0; i < fibRange; i++) {
			System.out.println(recFibonacci(i));
		}
	}

	private static int recFibonacci(int fibRange) {

		if(fibRange == 0){
			return 0;
		}if(fibRange == 1){
			return 1;
		}else{
			return recFibonacci(fibRange - 1) + recFibonacci(fibRange - 2);
		}
	}

	private static void loopFibonacci(int fibRange) {
		System.out.println("----------------------");
		int fFib = 0, sFib = 1, tFib;
		System.out.println("The Fibonacii Range is: ");
		System.out.println(fFib);
		System.out.println(sFib);
		
		for (int i = 0; i < fibRange - 2; i++) {
			tFib = fFib + sFib;
			System.out.println(tFib);
			fFib = sFib;
			sFib = tFib;
		}
		System.out.println("----------------------");
	}

}
