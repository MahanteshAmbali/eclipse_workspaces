package org.logical.arisGlobal;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayName = new int[]{11, 20, 40, 40, 53, 60, 30, 28, 11, 53};
		int dupCount = 1;
		
		for (int i = 0; i < arrayName.length-1; i++) {
			for (int j = i+1; j < arrayName.length; j++) {
				if(arrayName[i] == arrayName[j]){
					dupCount++;
					System.out.print(arrayName[i]+" occurs "+ dupCount + " times");
					System.out.print(" || ");
					System.out.println("Duplicate elements in the array: "+arrayName[i]);
					dupCount = 1;
				}
			}
		}
	}
}