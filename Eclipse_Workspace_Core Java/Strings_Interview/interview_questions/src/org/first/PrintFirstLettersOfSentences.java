package org.first;

import java.io.*;

public class PrintFirstLettersOfSentences {

	public static void main(String[] args) throws IOException{

		String inString;		
		char storeChar;
		int length;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Sentence: ");
		inString = br.readLine();
		
		inString = " " + inString;
		inString = inString.toUpperCase();
		
		length = inString.length();
		
		System.out.println("First Chars of the input string are: ");
		for (int i = 0; i < length; i++) {
			storeChar = inString.charAt(i);
			if(storeChar == ' '){
				System.out.println(inString.charAt(i+1));
			}
		}
	}
}
