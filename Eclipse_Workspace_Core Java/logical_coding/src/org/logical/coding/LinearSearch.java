package org.logical.coding;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of array elements");
		int numOfArrayElements = scanner.nextInt();
		int a[] = new int[numOfArrayElements];
		
		System.out.println("Enter array elements: ");
		for (int i = 0; i < numOfArrayElements; i++) {
			System.out.println("Enter "+i+" element");
			a[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the element to search: ");
		int linearSearchElement = scanner.nextInt();
		int i = 0;
		for (i = 0; i < numOfArrayElements; i++) {
			if(linearSearchElement == a[i]){
				System.out.println("Element found at index: "+i);
				break;
			}
		}
		if(numOfArrayElements == i){
			System.out.println("Element not found.!");
		}
	}

}
