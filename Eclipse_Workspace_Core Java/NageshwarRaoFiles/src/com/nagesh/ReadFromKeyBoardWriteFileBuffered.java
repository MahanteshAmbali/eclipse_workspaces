package com.nagesh;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ReadFromKeyBoardWriteFileBuffered {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		long endTime = 00;
		
		DataInputStream dis = new DataInputStream(System.in);
		
		FileOutputStream fout = new FileOutputStream("text1.txt", true);
		
		BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);
		
		System.out.println("Enter the contents: (Enter @ to terminate..!)");
		
		char ch;
		
		while((ch = (char)dis.read()) != '@'){
			bout.write(ch);
			endTime = System.currentTimeMillis();
		}
		System.out.println("Time taken to write is: "+(endTime - startTime)+" mili sec");
		bout.close();
		
		System.out.println("Writing to file done..!");
	}

}
