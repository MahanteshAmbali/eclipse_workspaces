package org.simple_file_handling;

import java.io.File;
import java.io.IOException;

public class C {

	public static void main(String[] args) {

		File f1 = new File("resume.doc");
		try {
			System.out.println("File status: "+f1.exists());
			System.out.println("File created: "+f1.createNewFile());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
