package org.console;

import java.io.Console;

public class Manager11 {

	public static void main(String[] args) {

		Console c1 = System.console();
		System.out.println("Enter some thing: "); 
		char[] x = c1.readPassword();
		String s1 = new String(x);
		System.out.println("You Entered: ");
		System.out.println(s1);
	}

}
