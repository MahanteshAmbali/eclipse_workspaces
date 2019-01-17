package org.simple_file_handling;

import java.io.File;
import java.io.IOException;

public class O {

	public static void main(String[] args) throws IOException{
		
		File f1 = new File("G:\\JAVA FOLDER\\Another Folder");
		File f2 = new File(f1, "bmw tone.mp3");
		f1.mkdir();
		f2.createNewFile();
		System.out.println(f1.isDirectory());
		System.out.println(f2.isFile());

	}

}
