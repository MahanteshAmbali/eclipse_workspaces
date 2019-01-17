package org.first;

import java.util.Scanner;

public class AllPossibilitiesOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = sc.next();
		
		for (int i = 0; i < inputString.length(); i++) {
			
			for (int j = 1; j <= inputString.length() - i; j++) {
			
				System.out.println(inputString.substring(i, i+j));
			}
		}
	}

}
