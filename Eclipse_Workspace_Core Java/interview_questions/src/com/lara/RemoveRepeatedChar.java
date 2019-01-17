//write a program to input a word from the user and remove the duplicate character by replacing th sequence of duplicate 
//characters by its single occurrence. 
package com.lara;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveRepeatedChar {		
	
	static String  str = "", temp = "";
	static int j = 0;
	
	static ArrayList list = new ArrayList();
	
	public static void main(String[] args){

		System.out.println("Enter string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		for (j = 0; j < str.length(); j++) {
			
			char ch = nonRepeat(str.charAt(j));
		}
		
	}

	public static char nonRepeat(char charAt) {
		
		String s2 = str.substring(0, j) + str.substring(j+1, str.length());
		list.add(s2);
		
		if(!(list.contains(charAt))){
			list.add(charAt);
		}
		System.out.println(list);
		return 0;
	}
}
