package org.buffered.write.read;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 = new File("G:\\Best Android Tut\\activity_life_cycle.png");
		File f2 = new File("test1.jpg");
		
		FileInputStream fIn = null;
		BufferedInputStream bIn = null;
		FileOutputStream fOut = null;
		BufferedOutputStream bOut = null;
		try {
			fIn = new FileInputStream(f1);
			bIn = new BufferedInputStream(fIn);
			
			byte[] b = new byte[(int)f1.length()];
			fIn.read(b);
			fOut = new FileOutputStream(f2);
			bOut = new BufferedOutputStream(fOut);
			bOut.write(b);
			System.out.println("Done");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(bOut != null){
				try {
					bOut.close();
					bOut = null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fOut != null){
				try {
					fOut.close();
					fOut = null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(bIn != null){
				try {
					bIn.close();
					bIn = null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fIn != null){
				try {
					fIn.close();
					fIn = null;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
