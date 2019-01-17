package com.lara.formatter;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "pi value is: ";
		String s2 = "is pi value";
		
		System.out.printf("%1$s %2$f\n", s1, Math.PI);
		System.out.printf("%2$f %1$s", s2, Math.PI);
	}

}
