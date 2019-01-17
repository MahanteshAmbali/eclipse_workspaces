package org.simple_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class R {

	public static void main(String[] args) throws IOException {

		FileWriter out = new FileWriter("G:\\JAVA FOLDER\\Updated Resume.doc");
		out.write("Hello World!\n");
		out.write("Hello World Again!\n");
		out.write("Hello World Again & Again!\n");
		out.flush();
		out.close();
		System.out.println("Done");
	}

}
