package com.lara;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String srcString = sc.next();
		
		boolean status = isPalindrome(srcString);
			
		if (status) {

			System.out.println("Input string is a Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}
	}

	private static boolean isPalindrome(String srcString) {

		for (int i = 0; i < (srcString.length() / 2); i++) {
			if(srcString.charAt(i) != srcString.charAt(srcString.length() -i -1)){
				return false;
			}
		}
		
		return true;
	}

}
