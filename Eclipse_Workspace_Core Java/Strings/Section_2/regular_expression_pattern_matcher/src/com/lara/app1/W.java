package com.lara.app1;

public class W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc1def2ghi3jkl4";
		String[] s2 = s1.split("\\d");
		
		for (String string : s2) {
			System.out.println(string);
		}
	}

}
