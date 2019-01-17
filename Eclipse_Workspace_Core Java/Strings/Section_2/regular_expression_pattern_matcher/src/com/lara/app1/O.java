package com.lara.app1;

public class O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E.find("abcd0123456789", "\\d");
		System.out.println("---------");
		
		E.find("abcd012adf3asdf456adsf789", "\\d+");
		System.out.println("----------");
	}

}
