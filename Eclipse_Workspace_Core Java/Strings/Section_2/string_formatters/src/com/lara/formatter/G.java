package com.lara.formatter;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello Again";
		String s2 = "Again Hello";
		
		System.out.printf("%s  :   %s ", s1, s2);
		System.out.printf("\n%s  :   %s ", s2, s1);
		System.out.printf("\n\n");
		System.out.printf("\n%1$s  :   %2$s", s2, s1);
		System.out.printf("\n%2$s  :   %1$s", s2, s1);
		
	}

}
