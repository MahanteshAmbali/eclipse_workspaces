package org.simple_file_handling;

import java.io.File;
import java.io.FileReader;

public class V {

	public static void main(String[] args) {

		FileReader fRead = null;
		
		File f1 = new File("G:\\JAVA FOLDER", "Updated Resume.doc");
	
		try {
				fRead = new FileReader(f1);
				char[] x = new char[(int)f1.length()];
				fRead.read(x);
				String s1 = new String(x);
				System.out.println(s1);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fRead != null){
					fRead.close();
					fRead = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}

}
