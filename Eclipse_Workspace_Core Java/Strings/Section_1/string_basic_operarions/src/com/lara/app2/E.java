package com.lara.app2;

import java.util.Locale;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc hello abc";
		String s2 = " abc ";
		/*
		int i = s1.indexOf("hel", 2);
		System.out.println(i);
		
		int j = s1.lastIndexOf("hello");	//LAST INDEX
		System.out.println("Last index of hello from 0: "+j);
		
		int k = s1.lastIndexOf("abc", 9);
		System.out.println("Last index of abc from 9: "+k);
		
		int l = s1.compareTo(s2);			//s1.compareTo(arg0); COMPARE TO OPERATION
		System.out.println("Compare to : "+l);
		
		int m = s1.compareToIgnoreCase(s2);
		System.out.println("Compare to Ignore Case: "+m);
		
		boolean a = s1.matches(s2);
		System.out.println(a);
		
		a = s1.startsWith("hello");
		System.out.println(a);
		
		int aa = s1.indexOf("abc", 0);
		System.out.println(aa);
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace('a', 'x'));
		System.out.println(s1.replaceAll("abc", "xyz"));
		System.out.println(s1.replaceFirst("abc", "xyz"));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(4, 9));		// substring(inclusive, exclusive);
		
		System.out.println(s1.substring(0, 3));
		
		System.out.println(s1.toString());
		System.out.println(s1.toUpperCase(new Locale("it")));
		System.out.println(s1.intern());
		*/
		String[] s4 = s1.split(s2);
		for (String string : s4) {
			System.out.println(string);	
		}
		
		String[] s3 = s1.split(" ");
		for (String string : s3) {
			System.out.println(string);
		}
	}

}
