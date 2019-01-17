package com.lara.app2;

public class M {

	public static void main(String[] args) {

		String s1 = "Mahantesh Ambali;Shri Shivayogi;183/1 Plot-12 10thCross;Vivekanand Nagar;Gokak";
		
		String[] s= s1.split(";");
		for (String string : s) {
			System.out.println(string);
		}
		
		s1 = s1.replaceAll(";", ":");
		System.out.println(s1);
		
		String[] s2 = s1.split(":");
		for (String string : s2) {
			System.out.println(string);
		}
	}
}
