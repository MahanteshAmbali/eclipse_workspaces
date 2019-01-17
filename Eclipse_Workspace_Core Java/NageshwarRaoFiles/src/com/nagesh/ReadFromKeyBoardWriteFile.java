package com.nagesh;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFromKeyBoardWriteFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		long endTime = 00;
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("text.txt", true);
		
		System.out.println("Enter the contents: (Enter @ to terminate..!)");
		
		char ch;
		
		while((ch = (char)dis.read()) != '@'){
			fout.write(ch);
			endTime = System.currentTimeMillis();
		}
		System.out.println("Time taken to write is: "+(endTime - startTime)+" mili sec");
		fout.close();
		
		System.out.println("Writing to file done..!");
	}

}
