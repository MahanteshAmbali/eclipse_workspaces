package com.lara;

import java.util.Scanner;

public class exchangeChars {

	public static void main(String[] args) {
		
		String src= "", des = "";
		
		System.out.println("Enter src: ");
		Scanner sc = new Scanner(System.in);
		src = sc.next();
		
		char a = src.charAt(src.length()-1);
		char b = src.charAt(0);
		
		des = a + src.substring(1, src.length()-1) + b;
		
		System.out.println(des);
	}

}
