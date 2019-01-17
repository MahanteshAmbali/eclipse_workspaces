package com.lara.collectionInterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Reader;

public class FileClass {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String f = "file1.java";
		File f1 = new File(f);
		
		InputStream uu = new FileInputStream(f1);
		
		RandomAccessFile gg = new RandomAccessFile(f1);

		
		FileOutputStream fou = new FileOutputStream(f1);
	}

}
