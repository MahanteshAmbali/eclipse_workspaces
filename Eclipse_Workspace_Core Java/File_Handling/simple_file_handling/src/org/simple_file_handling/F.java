package org.simple_file_handling;

import java.io.File;

public class F {

	public static void main(String[] args) {

		File f1 = new File("Z:/hello.html");
		
		try {
			System.out.println(f1.createNewFile());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
