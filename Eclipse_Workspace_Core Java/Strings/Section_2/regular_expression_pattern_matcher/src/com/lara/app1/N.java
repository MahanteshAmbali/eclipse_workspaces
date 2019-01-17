package com.lara.app1;

public class N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E.find("abcd0123456789", "[0-9]");
		System.out.println("-----------");
		
		E.find("abcd0123456789", "\\d");
	}

}
