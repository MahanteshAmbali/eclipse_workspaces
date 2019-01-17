package org.first;

import java.util.Scanner;

public class My_Sting_Split_Without_Split_Method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = sc.next();
		
		System.out.println("Enter the char reference to split the string: ");
		String refString = sc.next();
		
		mySplitString(inputString, refString);
	}

	private static void mySplitString(String inputString, String refString) {

		String temp1 = "", temp2= "";
		for (int i = 0; i < inputString.length(); i++) {
			char a = inputString.charAt(i);
			if(refString.equals(a)){
				temp1 = inputString.substring(0, i-1);
				temp2 = inputString.substring(i+1, inputString.length()-1);
			}
		}
		
		System.out.println("Splitted strings with ref to "+refString+" are: "+temp1+" & "+temp2);
	}
}
