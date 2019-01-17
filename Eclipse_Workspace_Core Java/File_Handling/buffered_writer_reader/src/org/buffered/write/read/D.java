package org.buffered.write.read;

import java.io.BufferedReader;
import java.io.FileReader;

public class D {

	public static void main(String[] args) {

		FileReader fR = null;
		BufferedReader bR = null;
		
		try {
			fR = new FileReader("G:\\JAVA FOLDER\\Updated Resume.doc");
			bR = new BufferedReader(fR);
			String s1= bR.readLine();
			while (s1 != null) {
				System.out.println(s1);
				s1 = bR.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(fR != null && bR != null){
					bR.close();
					fR.close();
					fR = null;
					bR = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		
	}

}
