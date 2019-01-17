package org.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatStringsGivenNoTimes {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String inString = br.readLine();
		
		System.out.println("Enter the number of times to repeat: ");
		int repeatTimes = br.read();
		
		String repeatedString = myRepreatString(inString, repeatTimes);
		
		
		System.out.println("RESULTING STRING: "+repeatedString);
	}

	private static String myRepreatString(String inString, int repeatTimes) {
		
		String resultString = null;
		for (int i = 0; i < repeatTimes; i++) {
			
			resultString = resultString + inString;
		}
		
		return resultString;
	}
}
