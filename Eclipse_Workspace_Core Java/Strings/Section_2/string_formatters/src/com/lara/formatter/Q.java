package com.lara.formatter;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12345;
		System.out.printf("%d", i);
		System.out.printf("\n(%d)", i);
		System.out.printf("\n(%1$d)", i);
		System.out.printf("\n(%1$10d)", i);		//same output as below line
		System.out.printf("\n(%10d)", i);		//same output as above line
	}

}
