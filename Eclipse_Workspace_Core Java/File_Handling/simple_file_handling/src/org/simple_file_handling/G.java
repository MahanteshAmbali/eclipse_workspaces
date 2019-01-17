package org.simple_file_handling;

import java.io.File;
import java.io.IOException;

public class G {

	public static void main(String[] args) throws IOException{

		File f1 = new File("D:\\New Folder1");
		boolean b1 = f1.mkdir();
		
		File f2 = new File("D:\\New Folder1\\helloworld.html");
		f2.createNewFile();
		System.out.println(b1);
		
		System.out.println("Done");
	}

}
