package org.java;

import java.io.BufferedReader;
import java.io.FileReader;

public class NameConcat {

	public static void main(String[] args)throws Exception {

		FileReader fin = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fin);
		String row = br.readLine();
		String[] cols;
		
		while(row != null){
			cols = row.split(" ");
			for (int i = 0; i < cols.length; i= i +2) {
				if(i %2 == 0){
					String fName = cols[i];
					String lName = cols[i+1];
					fName = fName + lName.substring(lName.length()-2, lName.length());
					System.out.println(fName);
				}
			}
			row = br.readLine();
		}
	}

}
