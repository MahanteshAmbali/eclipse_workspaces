package com.lara.app2;

public class K {

	public static void main(String[] args) {
		
		String s1 = "Mahantesh Ambali";
		int i = s1.indexOf(" ");
		
		String s2 = s1.substring(0, i);
		String s3 = s1.substring(i+1);
		
		System.out.println(s2);
		System.out.println(s3);

		String s4 = s1.intern();
		System.out.println(s4);
		
		s1 = s1.substring(s1.length());
		System.out.println(s1);
	}

}
