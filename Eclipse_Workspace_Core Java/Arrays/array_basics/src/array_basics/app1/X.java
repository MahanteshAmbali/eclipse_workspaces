package array_basics.app1;

import java.util.Arrays;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10,93,8,57,21,02};
		System.out.println("Original Array: "+Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("Sorted Array: "+Arrays.toString(x));
	
		System.out.println(Arrays.binarySearch(x, 2));
		System.out.println(Arrays.binarySearch(x, 100));
	}

}
