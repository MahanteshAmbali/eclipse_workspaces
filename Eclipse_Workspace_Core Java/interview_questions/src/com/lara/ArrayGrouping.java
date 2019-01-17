package com.lara;

import java.util.Scanner;

public class ArrayGrouping {

	public static void main(String[] args) {

		int j = 0, i = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements in array (Multiple of 3): ");
		int arraySize = sc.nextInt();
		int sum = 0;
		int[] array = new int[arraySize];
		
		if (arraySize % 3 == 0) {
			System.out.println("Enter array elements: ");
			for (int i1 = 0; i1 < arraySize; i1++) {
				array[i1] = sc.nextInt();
			}
			
			for (i = 1; i <= arraySize; i++) {
				
				if(!(i % 3 == 0)){
					sum = sum + array[i-1];
				}else{
					System.out.println("Sum of groups of 3 is: "+(sum + array[i]));
					sum = 0;
				}
				
			}
			
			
		}else{
			System.out.println("Run again, not multiple of 3");
		}
	}

}
