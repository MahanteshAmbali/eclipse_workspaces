package array_basics.app2;

import java.util.Arrays;

public class Manager5 {

	public static void main(String[] args) {

		int[] x = {9,42, 34, 23, 67};											//toString of Arrays 
		
		int[] y = {3, new Integer(40), 89, new Integer(58)};					// --same
		
		String[] s1 = {"xyz", new String("abc"), "dell", "sony", "12"};			// --same
		
		D[] d = {new D(430), new D(230), new D(993), new D(452), new D(23)};	//toString of D Class....!
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		System.out.println("----------------");
		
		System.out.println(Arrays.toString(y));
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		
		System.out.println("----------------");
		
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		
		System.out.println("----------------");
		
		System.out.println(Arrays.toString(d));
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));
		System.out.println("----------------");
	}

}
