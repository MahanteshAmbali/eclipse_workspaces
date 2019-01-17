package org.calci;

import java.util.Scanner;

public class SimpleCalc {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers to add: ");
		int addResult = add(scanner.nextInt(), scanner.nextInt());
		System.out.println("Addition of nums is: "+addResult);
		
		System.out.println("Enter numbers to sub: ");
		int subResult = sub(scanner.nextInt(), scanner.nextInt());
		System.out.println("Substraction of nums is: "+subResult);
	
		System.out.println("Enter numbers to mul: ");
		int mulResult = mul(scanner.nextInt(), scanner.nextInt());
		System.out.println("Multiplication of nums: "+mulResult);
		
		System.out.println("Enter numbers to div: ");
		int divResult = div(scanner.nextInt(), scanner.nextInt());
		System.out.println("Division of nums: "+divResult);
		
	}

	public static int div(int nextInt, int nextInt2) {
		// TODO Auto-generated method stub
		return nextInt / nextInt2;
	}

	public static int mul(int nextInt, int nextInt2) {
		// TODO Auto-generated method stub
		return nextInt * nextInt2;
	}

	public static int sub(int nextInt, int nextInt2) {
		// TODO Auto-generated method stub
		return nextInt - nextInt2;
	}

	public static int add(int nextInt, int nextInt2) {
		// TODO Auto-generated method stub
		return nextInt + nextInt2;
	}
}
