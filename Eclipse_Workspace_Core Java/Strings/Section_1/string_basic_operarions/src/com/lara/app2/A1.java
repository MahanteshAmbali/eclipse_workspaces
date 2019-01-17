package com.lara.app2;

public class A1 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "ja";
		String s3 = s2 + "va";
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

}
