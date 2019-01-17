package org.logical.arisGlobal;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayName = new int[]{11, 20, 33, 40, 53, 60, 24, 28, 83, 38};
		int sum = 0,  oddSum = 0;
		long avg;
		
		for (int i = 0; i < arrayName.length; i++) {
			sum = sum + arrayName[i];
		}
		
		avg = (long) (sum / arrayName.length);
		
		for (int i = 0; i < arrayName.length; i++) {
			if((arrayName[i] % 2) != 0){
				System.out.println("Odd Elements in array: "+arrayName[i]);
				oddSum = oddSum + arrayName[i];
			}
		}
		
		System.out.println("Sum of array elements: "+sum);

		System.out.println("Avg of array elements: "+avg);
		
		System.out.println("Sum of odd elements of array: "+oddSum);
		
	}

}
