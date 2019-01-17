package org.first;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String inputString = sc.next();
		String palindromeString = "";
		
		for (int i = inputString.length()-1; i >= 0 ; i--) {
				palindromeString = palindromeString + inputString.charAt(i);
		}
		
		if (inputString.equals(palindromeString)) {
			System.out.println("Inputted string is a Palindrome");
		}else{
			System.out.println("Not a palindrome");
		}
	}
}
