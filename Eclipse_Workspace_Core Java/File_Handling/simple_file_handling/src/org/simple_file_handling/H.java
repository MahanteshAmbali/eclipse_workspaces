package org.simple_file_handling;

import java.io.File;

public class H {

	public static void main(String[] args) {

		File f1 = new File("New Folder1");
		if(!(f1.exists())){
			System.out.println("Dir created: "+f1.mkdir());
		}
		else
			System.out.println("Dir exists");
	}

}
