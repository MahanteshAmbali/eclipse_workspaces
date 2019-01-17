package com.skanda;

public class FirstMockInterview {

	public static void main(String[] args) {

		String s1 = new String("String");
		String s2 = "String";
		String s3 = "String";
		String s4 = new String("String");
		
		System.out.println(s1 == s4);
		System.out.println(s2 == s3);
		
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
	}

}
