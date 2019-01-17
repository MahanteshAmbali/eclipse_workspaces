package org.logical.arisGlobal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReaderNumber {

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> arrayList = new ArrayList<String>();
	
		Scanner scanner = new Scanner(System.in);
		FileReader fileReader = new FileReader("text.txt");
		
		BufferedReader br = new BufferedReader(fileReader);
		
		System.out.println("Enter Line number: ");
		int lineNumber = scanner.nextInt();
		lineNumber--;
		String row = br.readLine();
		while(row != null){
			arrayList.add(row);
			row= br.readLine();
		}
		
		System.out.print("Text at line number "+(lineNumber+1) + " is: ");
		System.out.println(arrayList.get(lineNumber));
		
	}
	

}
