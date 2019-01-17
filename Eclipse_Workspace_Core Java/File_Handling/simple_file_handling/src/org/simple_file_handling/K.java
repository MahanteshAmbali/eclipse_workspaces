package org.simple_file_handling;

import java.io.File;
import java.io.IOException;

public class K {

	public static void main(String[] args) {

		File f1 = new File("G:\\New Folder\\New Folder");
		System.out.println(f1.mkdir());
		
		File f2 = new File(f1,"funny.mp3");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
