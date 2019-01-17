package com.lara;

import java.util.Scanner;

public class SwapTwoStrings {

	// USING TEMP VARIABLE
	
	/*public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st string: ");
		String srcString = sc.next();

		System.out.println("Enter 2nd string: ");
		String desString = sc.next();
		
		String tempString;
		
		System.out.println("Inputted strings are: "+srcString+" & "+desString);
		
		tempString = srcString;
		srcString = desString;
		desString = tempString;
		
		System.out.println("Swapped strings are: "+srcString+" & "+desString);
	}*/
	
	//WITHOUT USING TEMP VARIABLE
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st string: ");
		String srcString = sc.next();

		System.out.println("Enter 2nd string: ");
		String desString = sc.next();
		
		System.out.println("The inputted strings: "+srcString+" & " + desString);
		
		//USING CONCAT MATHOD
		int i1 = srcString.length() - 1;
		int j1 = desString.length() - 1;
		
		srcString = srcString.concat(desString);
		
		desString = srcString.substring(0, i1+1);
		srcString = srcString.substring(i1+1, (i1+j1+2));
		
		
		//USING STRING BUFFER
		/*StringBuffer sb1 = new StringBuffer(srcString);
		StringBuffer sb2 = new StringBuffer(desString);
		
		int i = sb1.length() - 1;
		int j = sb2.length() - 1;
		
		sb1.append(desString);
		desString = (String) sb1.substring(0 , i+1);
		srcString = (String) sb1.substring(i+1 , (i+j+2));*/
		
		System.out.println("The swapped string are: "+srcString + " & "+desString);
		
	}
}
