package com.lara.app2;

public class H {

	public static void main(String[] args) {
		
		String s1 = "abc abc abc abc xyz";
		String s2 = "xyz abc xyz xyz";
		
		int j = s1.codePointAt(0);
		int j1 = s1.codePointBefore(1); 
		
		System.out.println(j+" "+ j1);
		
		boolean i = s1.contains(s2.substring(13, 15));
		System.out.println(i);
		
		int k = s1.lastIndexOf("abc", 5);
		System.out.println(k);
		
		int l = s1.lastIndexOf("abc", 9);
		System.out.println(l);
	}

}
