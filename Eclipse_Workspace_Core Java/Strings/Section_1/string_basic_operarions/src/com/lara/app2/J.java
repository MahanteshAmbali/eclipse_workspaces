package com.lara.app2;

public class J {

	public static void main(String[] args) {
		
		String s1 = "lara tech";
		
		int i = s1.indexOf(" ");
		
		String s2 = s1.substring(0, i) ;
		String s3 = s1.substring(i+1, s1.length());
		
		System.out.println(s2+""+s3);
		System.out.println(s3);
		
		String s4 = "abc abc abc xyz";
		int j = s4.lastIndexOf(" ");
		
		String s5 = s4.substring(0, j);
		
		System.out.println(s5);
	}
}
