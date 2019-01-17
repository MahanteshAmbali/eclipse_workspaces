package array_basics.app1;

import java.util.Arrays;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10, 2, 91, 43, 78};
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int i = Arrays.binarySearch(x, 50);
		System.out.println(i);
	}

}
