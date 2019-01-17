package org.logical.coding;

import java.util.Scanner;

public class MultiplyTwoMatrices {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows & cols for 1st matrix");
		int rowsFirst, colsFirst, sum = 0;

		rowsFirst = scanner.nextInt();
		colsFirst = scanner.nextInt();
		
		int firstMatrix[][] = new int[rowsFirst][colsFirst];
		
		System.out.println("Enter first matrix");
		for (int i = 0; i < rowsFirst; i++) {
			for (int j = 0; j < colsFirst; j++) {
				firstMatrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter number of rows & cols for 2nd matrix");
		int rowsSecond, colsSecond;

		rowsSecond = scanner.nextInt();
		colsSecond = scanner.nextInt();
		int secondMatrix[][] = new int[rowsSecond][colsSecond];
		int multiplyResult[][] = new int[rowsFirst][colsSecond];
		
		System.out.println("Enter second matrix");
		for (int i = 0; i < rowsSecond; i++) {
			for (int j = 0; j < colsSecond; j++) {
				secondMatrix[i][j] = scanner.nextInt();
			}
		}
		
		if(colsFirst != rowsSecond){
			System.out.println("Matrices with entered order cant be multiplied");
		}else{
			for (int i = 0; i < rowsFirst; i++) {
				for (int j = 0; j < rowsSecond; j++) {
					for (int j2 = 0; j2 < colsSecond; j2++) {
						sum = sum + (firstMatrix[i][j2] * secondMatrix[j2][j]);
					}
					multiplyResult[i][j] = sum;
					sum = 0;
				}
			}
		}
		
		System.out.println("Product of two matrices is: ");
		for (int i = 0; i < rowsFirst; i++) {
			for (int j = 0; j < colsSecond; j++) {
				System.out.print(multiplyResult[i][j]);
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
