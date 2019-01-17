package com.lara.app1;

import java.util.StringTokenizer;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc;def;hello;done";
		String s2 = ";";
		
		StringTokenizer st = new StringTokenizer(s1, s2);
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

}
