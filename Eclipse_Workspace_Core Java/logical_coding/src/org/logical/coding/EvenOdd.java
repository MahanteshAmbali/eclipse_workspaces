package org.logical.coding;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();
		if(number %2 == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}

}
