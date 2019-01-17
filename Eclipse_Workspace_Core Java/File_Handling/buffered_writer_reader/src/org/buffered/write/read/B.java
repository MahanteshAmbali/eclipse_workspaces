package org.buffered.write.read;

import java.io.BufferedReader;
import java.io.FileReader;

public class B {

	public static void main(String[] args) throws Exception{
		
		FileReader fRead = new FileReader("G:\\JAVA FOLDER\\Updated Resume.doc");
		BufferedReader bRead = new BufferedReader(fRead);
		String s1 = bRead.readLine();
		while(s1 != null){
			System.out.println(s1);
			s1 = bRead.readLine();
		}
		
		bRead.close();
		fRead.close();
		bRead = null;
		System.out.println("Done");
	}

}
