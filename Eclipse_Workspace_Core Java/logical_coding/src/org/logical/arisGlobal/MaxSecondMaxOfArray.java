package org.logical.arisGlobal;

public class MaxSecondMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayName = new int[]{50, 11, 20, 33, 40};
		int temp = 0;
		
		for (int i = 0; i < arrayName.length-1; i++) {
			for (int j = 0; j < arrayName.length-1-i; j++) {
				if(arrayName[j] > arrayName[j+1]){
					temp = arrayName[j];
					arrayName[j] = arrayName[j+1];
					arrayName[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
		
		System.out.println("Max of array: "+arrayName[arrayName.length-1]);
		System.out.println("2nd Max of array: "+arrayName[arrayName.length-2]);
	}
}
