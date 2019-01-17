package org.simple_file_handling;

import java.io.File;

public class B {

	public static void main(String[] args) throws Exception{

		File f1 = new File("test.txt");
		
		if (f1.exists()) {
			System.out.println("File Exists. !(New File Status): "+!(f1.exists()));
		}
		
		else {
			
			System.out.println("File Created (New File Status): "+f1.createNewFile());
		}
		
	}

}
