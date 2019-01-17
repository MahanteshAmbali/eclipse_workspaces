package com.lara.app2;

public class N {

	public static void main(String[] args) {
		
		String s1 = "Mahantesh Ambali Shri Shivayogi 183/1 Plot-12 10thCross Vivekanand Nagar Gokak";
		
		String[] s = s1.split("");
		
		System.out.println(s.length);
		
		for (String string : s) {
			System.out.println(string);
		}
		
		
	}
}
