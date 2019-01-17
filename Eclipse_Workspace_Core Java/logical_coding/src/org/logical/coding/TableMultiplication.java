package org.logical.coding;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {

		int number = 0;
		System.out.println("Enter number to print its table: ");
		Scanner scanner = new Scanner(System.in);
		synchronized (scanner) {
			try {
				number = scanner.nextInt(); 
				if(number == 0){
					throw new ArithmeticException("Can't get 0 table");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		System.out.println("Table of "+number+" is: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);
		}
	}

}
