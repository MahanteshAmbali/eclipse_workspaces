package com.lara.app1;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E.find("abcd0123456789", "[a-z][0-9]");
		
		String s1 ="abcd0e1f2g3h4i5j6k7l8m9";
		String s2 = "[a-z][0-9]";
		E.find(s1, s2);
	}

}
