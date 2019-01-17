package com.lara;

import java.util.Scanner;

public class All_Possibilities_Of_String_Count_Input_String {

	public static void main(String[] args) {
	
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		
		String sub, searchToken = "";
		int searchTokenCount = 0;
		
		System.out.println("Enter the search string: ");
		searchToken = sc.next();
		
		
		
		int length = inputString.length();
		System.out.println("length="+length);
		System.out.println("Substrings of inputString "+inputString+" are: ");
		for (int i = 0; i < length; i++) {
			for (int j = 1; j <= length - i; j++) {
				sub = inputString.substring(i, i+j);
				System.out.println(sub);
				
				if(sub.equals(searchToken)){
					searchTokenCount++;
				}
			}
		}
		
		System.out.println("The search token "+ searchToken + " occurs "+ searchTokenCount + " times");
	}

}
