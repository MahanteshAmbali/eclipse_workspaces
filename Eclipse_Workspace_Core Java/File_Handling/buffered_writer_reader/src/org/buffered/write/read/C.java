package org.buffered.write.read;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class C {

	public static void main(String[] args) {

		FileWriter fW = null;
		BufferedWriter bW = null;
		
		try {
			fW = new FileWriter("G:\\JAVA FOLDER\\Updated Resume.doc");
			bW = new BufferedWriter(fW);
			
			bW.write("Hello to all\n");
			bW.write("Hello to all\n");
			bW.write("Hello to all\n");
			bW.write("Hello to all\n");
			bW.write("Hello to all\n");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if (fW != null && bW != null) {
					bW.flush();
					fW.close();
					bW.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		System.out.println("Done");
	}

}
