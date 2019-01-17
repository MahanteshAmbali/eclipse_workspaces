package org.console;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Manager15 {

	public static void main(String[] args) throws FileNotFoundException{

		System.out.println("In console: "+100);
		
		PrintStream ps = new PrintStream("test2.log");
		System.setOut(ps);
		
		System.out.println("In stream pointed be PrintStream: "+200);
	}

}
