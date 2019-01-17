package com.lara.app2;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcabcabc";
		
		int i = s1.indexOf('a');
		System.out.println(i);

		int j = s1.indexOf('a',4);
		System.out.println(j);
		
		int k = s1.indexOf('c');
		System.out.println(k);
		
		int l = s1.indexOf('c',6);
		System.out.println(l);
	}

}
