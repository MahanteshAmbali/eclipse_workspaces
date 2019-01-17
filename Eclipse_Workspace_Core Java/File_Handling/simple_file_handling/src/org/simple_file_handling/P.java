package org.simple_file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P {

	public static void main(String[] args) {
	
		FileWriter out;
		File f1 = new File("G:\\JAVA FOLDER\\Resumes");
		System.out.println(f1.mkdirs());
		
		File f2 = new File(f1,"Updated Resume.doc");
		File f3 = new File(f1, "helloWorld.html");
		
		try {
			System.out.println(f2.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			out = new FileWriter(f2);
			out.write("Curriculam Viate\n");
			out.write("Mahantesh V Ambali\n Shri Shivayogi\n 183/1");
			out.write("mahantesh378@gmail.com");
			out.write("9844990484");
			out.flush();
			out.close();
			
			out = new FileWriter(f3);
			out.write("<title> My Page From Java Program</title>");
			out.write("<center><h1> Welcome to my Page</h1></center>");
			out.write("<a href = "+"C:\\Users\\Mant\\Desktop\\asciifull.jpg></a>"+"");
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
