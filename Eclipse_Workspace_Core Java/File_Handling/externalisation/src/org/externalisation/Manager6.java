package org.externalisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class E implements Serializable{
	
	int i;
	double j;
}

public class Manager6 {

	public static void main(String[] args) {

		FileOutputStream fout;
		ObjectOutputStream oout =null;
		FileInputStream fin;
		ObjectInputStream oin = null;
		
		E e1 = new E();
		e1.i = 100;
		e1.j = 200.200;
		
		E e2 = new E();
		e2.i = 300;
		e2.j = 400.400;
		
		try {
			
			fout = new FileOutputStream("test6.txt");
			oout = new ObjectOutputStream(fout);
			oout.writeInt(e1.i);
			oout.writeDouble(e1.j);

			oout.writeInt(e2.i);
			oout.writeDouble(e2.j);
			
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
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
		}
		
		try {
			
			fin = new FileInputStream("test6.txt");
			oin = new ObjectInputStream(fin);
			int i = oin.readInt();
			double d = oin.readDouble();
			
			int j = oin.readInt();
			double dd = oin.readDouble();
			
			System.out.println("Object 1's attribs: "+i+ "&  "+d);
			System.out.println("Object 2's attribs: "+j+ "&  "+dd);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				
				if(oin != null){
					oin = null;
				}
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
		}
	}

}
