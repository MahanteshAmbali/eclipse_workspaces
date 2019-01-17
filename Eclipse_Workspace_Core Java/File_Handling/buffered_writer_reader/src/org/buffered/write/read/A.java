package org.buffered.write.read;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws Exception {

		String ch;
		File file = new File("G:\\JAVA FOLDER\\Updated Resume.doc");
		file.createNewFile();
		FileWriter fW = new FileWriter("G:\\JAVA FOLDER\\Updated Resume.doc");
		BufferedWriter bout = new BufferedWriter(fW);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter now: ");
		ch = sc.next();
		bout.append(ch);
		bout.flush();
		bout.close();
		System.out.println("Done");
	}
}
