package org.simple_file_handling;

import java.io.File;
import java.io.IOException;

public class M {

	public static void main(String[] args) {
		
		File f0 = new File("G:\\JAVA FOLDER\\Another Folder");
		File f1 = new File("G:\\JAVA FOLDER", "Updated Resume.doc");
		File f4 = new File("G:\\JAVA FOLDER\\Another Folder", "bmw tone.mp3");
		File file = new File("G:");
		
		System.out.println(f0.mkdirs());
		
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(f4.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] list = file.list();
		for (String string : list) {
			System.out.println(string);
		}
		
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2);
		}
	}

}
