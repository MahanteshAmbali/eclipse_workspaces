package org.simple_file_handling;

import java.io.File;

public class E {

	public static void main(String[] args) {
		
		File f1 = new File("D:\\New Folder\\sunny leone.html");
		
		try {
			System.out.println("Status: "+f1.createNewFile());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
