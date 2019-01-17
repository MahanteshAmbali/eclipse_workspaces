package org.simple_file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("G:\\New Data from Deepu\\www.javatpoint.com", "android.html");
		FileWriter out = new FileWriter(f1);

		out.write("<h1>Hacked Android File</h1>");
		
		out.flush();
		out.close();
		System.out.println("Done");
	}

}
