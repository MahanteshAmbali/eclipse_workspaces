package org.logical.coding;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {

		int num = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rows in the Floyd's triangle");
		int row = scanner.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}
	}

}
