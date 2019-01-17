package org.simple_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S {

	public static void main(String[] args) throws IOException {

		File f1 = new File("C:\\Users\\Mant\\Desktop\\freecharge.txt");
		FileReader fRead = new FileReader(f1);
		long size = f1.length();
		char[] buff = new char[(int)size];
		
		int value = fRead.read(buff);
		fRead.close();
		
		System.out.println("Value: "+value);
		
		for (char c : buff) {
			System.out.print(c);
		}
		System.out.println();
		String s1 = new String(buff);
		System.out.println(s1);
	}

}
