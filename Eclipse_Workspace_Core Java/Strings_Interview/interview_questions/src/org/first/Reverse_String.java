

package org.first;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = sc.next();
		String reverseString = "";
		
		for (int i = inputString.length()-1; i >= 0; i--) {
			
			reverseString = reverseString + inputString.charAt(i);
		}
		
		System.out.println("The input string is: "+inputString);
		System.out.println("The reverse string is: "+reverseString);
	}

}
