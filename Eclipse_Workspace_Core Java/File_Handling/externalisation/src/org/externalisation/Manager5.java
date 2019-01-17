package org.externalisation;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class D implements Externalizable{
	
	int i;
	double j;
	String s1;
	
	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
	
		arg0.writeInt(i);
		arg0.writeDouble(j);
		arg0.writeUTF(s1);
	}
	
	@Override
	public void readExternal(ObjectInput arg0) throws IOException,
			ClassNotFoundException {
	
		i = arg0.readInt();
		j = arg0.readDouble();
		s1 = arg0.readUTF();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+ i + " ,j: "+ j + ", s1: "+s1;
	}
}

public class Manager5 {

	public static void main(String[] args) throws Exception{
	
		externalize();
		deExternalize();
	}

	private static void externalize() throws Exception{
		
		D d1 = new D();
		d1.i = 100;
		d1.j = 200.200;
		d1.s1 = "Mahantesh";
		
		FileOutputStream fout = new FileOutputStream("test5.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		d1.writeExternal(oout);
		
		oout.flush();
		oout.close();
		
	}

	private static void deExternalize() throws Exception{

		FileInputStream fin = new FileInputStream("test5.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		D d2 = new D();
		d2.readExternal(oin);
		
		System.out.println(d2);
	}
}