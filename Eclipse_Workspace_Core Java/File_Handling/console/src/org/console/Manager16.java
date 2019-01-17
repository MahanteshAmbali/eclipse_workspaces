package org.console;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Manager16 {

	public static void main(String[] args) throws FileNotFoundException{

		PrintStream ps1 = System.out;
		PrintStream ps2 = new PrintStream("test12.txt");
		
		System.out.println(1);
		
		ps1.println("Hello World");
		ps2.println("Hello World");
	

	}

}
