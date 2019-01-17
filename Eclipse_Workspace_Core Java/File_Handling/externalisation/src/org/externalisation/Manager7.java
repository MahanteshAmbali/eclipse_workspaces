package org.externalisation;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class F implements Externalizable{
	
	int i;
	double j;
	
	public F() {
	
	}
	
	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
	
		arg0.writeInt(i);
		arg0.writeDouble(j);

	}
	
	@Override
	public void readExternal(ObjectInput arg0) throws IOException,
			ClassNotFoundException {
	
		i = arg0.readInt();
		j = arg0.readDouble();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+ i + ", j: "+j;
	}
}

public class Manager7 {

	public static void main(String[] args) {

		F f1 = new F();
		f1.i = 100;
		f1.j = 200.2;
		
		F f2 = new F();
		f2.i = 300;
		f2.j = 400.4;
		
		F f3 = new F();
		F f4 = new F();
		
		FileInputStream fin;
		FileOutputStream fout;
		ObjectOutputStream oout = null;
		ObjectInputStream oin = null;
		
		try {
			fout = new FileOutputStream("test7.txt");
			oout = new ObjectOutputStream(fout);
			
			f1.writeExternal(oout);
			f2.writeExternal(oout);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if (oout != null) {
					oout.flush();
					oout.close();
					oout = null;
				}
			} catch (Exception e2) {

				e2.printStackTrace();
			}
		}
		
		try {
			
			fin = new FileInputStream("test7.txt");
			oin = new ObjectInputStream(fin);
			
			f3.readExternal(oin);
			
			f4.readExternal(oin);
			
			System.out.println("f3:  "+f3);
			System.out.println("f4:  "+f4);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(oin != null){
				oin = null;
			}
		}
	}
}
