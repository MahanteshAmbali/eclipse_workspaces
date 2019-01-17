package com.lara.app1;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ab123c29hello28done5";
		E.find(s1, "2");
		System.out.println("----------");
		
		E.find(s1, "[1-9]");
		System.out.println("----------");
		
		E.find(s1, "[21]");
		System.out.println("----------");
	}

}
