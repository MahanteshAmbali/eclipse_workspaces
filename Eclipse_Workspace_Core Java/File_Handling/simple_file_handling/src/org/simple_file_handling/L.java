package org.simple_file_handling;

import java.io.File;

public class L {

	public static void main(String[] args) {

		File f1 = new File("D:\\New Folder");
		f1.mkdir();
		File f2 = new File(f1, "abc");
		System.out.println(f2.mkdir());
	}

}
