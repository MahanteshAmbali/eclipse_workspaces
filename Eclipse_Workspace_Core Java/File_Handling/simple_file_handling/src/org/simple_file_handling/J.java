package org.simple_file_handling;

import java.io.File;

public class J {

	public static void main(String[] args) {

		File f1 = new File("Folder");
		boolean b1 = f1.mkdir();
		
		File f2 = new File(f1,"hello.html");
		try {
			System.out.println(f2.createNewFile());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
