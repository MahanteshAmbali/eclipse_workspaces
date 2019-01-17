package org.simple_file_handling;

import java.io.File;

public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f1 = new File("abc.txt");
		boolean b1 = f1.createNewFile();
		System.out.println(b1);
		System.out.println("Done");
	}

}
