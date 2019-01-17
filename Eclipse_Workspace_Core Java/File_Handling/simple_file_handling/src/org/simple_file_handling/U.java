package org.simple_file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class U {

	public static void main(String[] args){

		FileWriter fWrite = null;
		try {
			fWrite = new FileWriter("G:\\JAVA FOLDER\\Updated Resume.doc");		//absolute path
			fWrite.write("LARA TECHNOLOGIES\n Software Training Division\n Udupi Garden\n Bangalore- 076");
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally{
			
			try {
				if(fWrite != null){
					
					fWrite.flush();
					fWrite.close();
					fWrite = null;
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
