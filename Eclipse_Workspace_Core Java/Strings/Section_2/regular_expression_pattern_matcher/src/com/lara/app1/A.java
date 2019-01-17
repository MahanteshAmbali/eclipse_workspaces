package com.lara.app1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {

	public static void main(String[] args) {
		
		String s1 = "abcabc9090abc";
		String s2 = "c";
		boolean b;
		
		Pattern p1 = Pattern.compile(s2);
		Matcher m1 = p1.matcher(s1);
		
		System.out.println(b = m1.matches());
		while (m1.find()) {
			
			System.out.println(m1.start());
		}
	}
}
