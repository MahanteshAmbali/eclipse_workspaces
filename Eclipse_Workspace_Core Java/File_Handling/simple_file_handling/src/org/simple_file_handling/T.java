package org.simple_file_handling;

import java.io.FileReader;
import java.io.IOException;

public class T {

	public static void main(String[] args) throws IOException {
		
		FileReader fR = new FileReader("C:\\Users\\Mant\\Desktop\\airtel 3g Dongle.txt");
		char[] buff = new char[100];
		int i = fR.read(buff);
		
		String s1 = new String(buff);
		System.out.println("s1: "+s1);
		System.out.println("i: "+i);
	}

}
