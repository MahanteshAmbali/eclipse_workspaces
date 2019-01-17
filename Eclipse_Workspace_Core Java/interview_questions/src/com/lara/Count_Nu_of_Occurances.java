package com.lara;

import java.util.Scanner;

public class Count_Nu_of_Occurances {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = sc.nextLine();
		int count = 0;
		String tempString = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			for (int j = i; j < inputString.length(); j++) {
				char v = inputString.charAt(j);
				if((c == v) && tempString.indexOf(c) == -1){
					
					count++;
					tempString = tempString + "";
					
				}
				if (tempString.indexOf(c) == -1) {
					tempString = tempString + c;
					System.out.println(c+" occurs "+count+" times ");
				}	
			}
			
			count = 0;			
		}
		
		System.out.println("The unrepeated string is: "+tempString);
	}
}