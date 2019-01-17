package com.lara.app2;

public class Manager7 {

	public static void main(String[] args) {

		String s1 = "Mahantesh";
		String s2 = "mahantesh";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		boolean condition = myequalsIgnoreCase(s1, s2);
		
		if(condition){
			System.out.println("Both strings are equal");
		}
		
		System.out.println("Unequal");
	}

	public static boolean myequalsIgnoreCase(String s1, String s2) {
	
		String[] fString = s1.split("");
		String[] sString = s2.split("");
		String c1;
		String c2;
		
		for (int i = 0; i < fString.length; i++) {
			
			c1 = fString[i];
			c2 = sString[i];
			
			/*if(fString[i] == sString[i]){
				return true;
			}*/
			
			
		}
		return false;
	}
}
