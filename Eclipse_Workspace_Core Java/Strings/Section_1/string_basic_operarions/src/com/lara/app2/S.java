package com.lara.app2;

public class S {

	public static void main(String[] args) {

		String s1 = "Hello to all";
		
		System.out.println(s1.startsWith("hello"));
		System.out.println(s1.startsWith("Hello", 1));
		
		System.out.println(s1.endsWith("all"));

	}

}
