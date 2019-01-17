package org.logical.coding;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows & cols");
		int rows, cols;

		rows = scanner.nextInt();
		cols = scanner.nextInt();
		
		int firstMatrix[][] = new int[rows][cols];
		int secondMatrix[][] = new int[rows][cols];
		int resultMatrix[][] = new int[rows][cols];
		
		System.out.println("Enter first matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				firstMatrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter second matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				secondMatrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("RESULTING MATRIX");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
