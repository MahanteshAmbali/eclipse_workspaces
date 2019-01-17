package com.lara.app1;

import java.util.StringTokenizer;

public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello1abc2done3";
		String s2 = "[0-9]";
		
		StringTokenizer st = new StringTokenizer(s1, s2);
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

}
