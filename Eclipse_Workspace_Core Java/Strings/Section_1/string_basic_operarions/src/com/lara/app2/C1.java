package com.lara.app2;

public class C1 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "ja";
		String s3 = s2.concat("va");
		String s4 = "ja" + "va";
		
		System.out.println(s1==s3);
		System.out.println(s1==s4);

	}

}
