package com.lara;

import java.util.ArrayList;
import java.util.Scanner;

public class changevalues {

	public static void main(String[] args) {
		
		int shiftIndexRow , shiftIndexCol;
		int tempVal = 0, prevVal = 0, nextVal = 0;
		
		ArrayList list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter num of rows: ");
		int row = sc.nextInt();

		System.out.println("Enter num of cols: ");
		int cols = sc.nextInt();
		
		int[][] sourceArray = new int[row][cols];
		int[][] duplicArray = new int[row][cols];
		
		System.out.println("Enter elements: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				sourceArray[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("You have entered: ");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println(sourceArray[i][j]);
			}
		}
		
		System.out.println("Enter the row index to shift");
		shiftIndexRow = sc.nextInt()-1;
		
		System.out.println("Enter the col index to shift");
		shiftIndexCol = sc.nextInt()-1;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				
				if (i==shiftIndexRow && j == shiftIndexCol) {
					
					tempVal = duplicArray[i][j];
					duplicArray[i][j] = sourceArray[row][cols];
					
				}
				if(i == shiftIndexRow+1 && j == shiftIndexCol+1){
					nextVal = duplicArray[i][j];
					duplicArray[i][j] = tempVal;
				}
				
				duplicArray[i][j] = sourceArray[i][j];
			}
		}
		
		System.out.println("Shifted Array: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println(duplicArray[i][j]);
			}
			
		}
	}
}
