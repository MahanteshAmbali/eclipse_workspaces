package org.console;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Manager14 {

	public static void main(String[] args) throws FileNotFoundException {

	PrintStream ps = new PrintStream("test1.txt");
	System.setOut(ps);
	
	ps.println("Hello to All");
	ps.println("Hello to All");
	ps.println("Hello to All");
	ps.println("Hello to All");
	ps.println("Hello to All");
	}

}
