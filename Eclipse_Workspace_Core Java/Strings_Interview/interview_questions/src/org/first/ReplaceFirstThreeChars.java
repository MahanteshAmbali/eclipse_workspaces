package org.first;

import java.util.Scanner;

public class ReplaceFirstThreeChars {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inString = sc.next();
		String threeString = "", remainString = null;
		
		if(inString.startsWith("not")){
		
			System.out.println("Enter the 3 replacement chars");
			threeString = sc.next();
			
			for (int i = 3; i < inString.length(); i++) {
				remainString = remainString + inString.charAt(i);
			}
		}
	}
}
