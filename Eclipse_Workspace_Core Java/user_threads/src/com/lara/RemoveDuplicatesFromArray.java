package com.lara;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	private static int[] array = {10, 20, 30, 10, 30, 50, 60, 40, 50, 60};
	private static int size = array.length;
	
	public static void main(String[] args) {

		System.out.println("Source Array: "+Arrays.toString(array));
		System.out.println("Src array size: "+size);
		for (int i = 0; i < size; i++) {
			for (int j = i +1; j < size; j++) {
				if(array[i] == array[j]){
					while(j < (size) - 1){
						array[j] =  array[j+1];
						j++;
					}
					size--;
				}
			}
		}
		
		System.out.println("Array without dups: "+Arrays.toString(array));
		System.out.println("Src array size: "+size);
	}

}
