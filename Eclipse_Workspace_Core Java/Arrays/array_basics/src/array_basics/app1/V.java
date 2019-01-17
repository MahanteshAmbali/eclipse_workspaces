package array_basics.app1;

import java.util.Arrays;

public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x = { "abc",
					   "Abc",
					   "ABC",
					   "ABc",
					   "abC",
					   "123"				
					 };
		
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}