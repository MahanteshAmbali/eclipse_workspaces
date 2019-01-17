package com.lara.formatter;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		System.out.printf("%s", s1);
		System.out.printf("\n(%s)", s1);
		System.out.printf("\n(%1$s)", s1);
		System.out.printf("\n(%1$10s)", s1);
		System.out.printf("\n(%1$15s)", s1);
		System.out.printf("\n(%10s)",s1);
	}

}
