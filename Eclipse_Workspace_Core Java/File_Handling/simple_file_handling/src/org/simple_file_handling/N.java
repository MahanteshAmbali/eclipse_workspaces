package org.simple_file_handling;

import java.io.File;

public class N {

	public static void main(String[] args) {

		File f1 = new File("G:/a/b/c/d/e/f/g/h/i/j");
		System.out.println(f1.mkdirs());
		File f2 = new File(f1, "helloWorld.html");
		try {
			f2.createNewFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
