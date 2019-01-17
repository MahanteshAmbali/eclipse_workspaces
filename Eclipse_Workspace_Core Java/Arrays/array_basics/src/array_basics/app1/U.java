package array_basics.app1;

import java.util.Arrays;

public class U {

	public static void main(String[] args) {

		String[] x = { "xyz",
					   "abc",
					   "pqw",
					   "adsf",
					   "12pa"
					 };
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}

}
