package com.lara;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapAndRevStrings {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		String s1 = br.readLine();
		String revChars = "";
		
		String[] nameArray = s1.split(" ");
		
		for (String string : nameArray) {
			for (int i = string.length()-1; i >= 0 ; i--) {
				revChars = revChars + string.charAt(i);
			}
		
			revChars = revChars + " ";
		}
		System.out.println(revChars);
		
		
		
		/*int nameArrayIndex = nameArray.length - 1;
		for (int i = 0; i < nameArray.length; i++) {
			String localString = nameArray[nameArrayIndex--];
			for (int j = localString.length()-1; j >= 0; j--) {
				revChars = revChars + localString.charAt(j);
			}
			revChars = revChars + " ";
		}
		
		System.out.println(revChars);*/
		
		/*for (int i = s1.length() - 1; i >= 0; i--) {
			revChars = revChars + s1.charAt(i);
		}
		
		System.out.println(revChars);*/
	}

}
