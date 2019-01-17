package org.simple_file_handling;

import java.io.File;

public class I {

	public static void main(String[] args) {
		
		File f1 = new File("Z:/Hello");
		System.out.println(f1.mkdir());
		System.out.println("Done");
	}

}
