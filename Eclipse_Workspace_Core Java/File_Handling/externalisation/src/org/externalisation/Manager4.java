package org.externalisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Manager4 {

	public static void main(String[] args) {
		
		FileOutputStream fout;
		ObjectOutputStream oout = null;
		FileInputStream fin;
		ObjectInputStream oin = null;
		
		try {
			fout = new FileOutputStream("test4.txt");
			oout = new ObjectOutputStream(fout);
			oout.writeInt(100);
			oout.writeShort(20);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(oout != null){
					oout.flush();
					oout.close();
					oout = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		try {
			fin = new FileInputStream("test4.txt");
			oin = new ObjectInputStream(fin);
			
			System.out.println(oin.readInt());
			System.out.println(oin.readShort());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(oin != null){
					
					oout = null;
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}