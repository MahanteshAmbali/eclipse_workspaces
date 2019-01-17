package org.simple_file_handling;

import java.io.File;

public class D {

	public static void main(String[] args) {

		File f1 = new File("D:/test.html");
		
		try {
			System.out.println("Status: "+f1.createNewFile());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
