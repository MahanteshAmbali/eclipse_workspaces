package org.externalisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable{
	
	int i;
	String s1;
	double d1;
	Boolean falg;
	
}

public class Manager2 {

	public static void main(String[] args) throws Exception {
	
		doExternalize();
		doDeExternalize();
	}

	@SuppressWarnings(value = { "resource" })
	private static void doExternalize() throws Exception{

		B b1 = new B();
		b1.i = 10;
		b1.s1 = "Mahantesh";
		b1.d1 = 20.0;
		b1.falg = true;
		
		FileOutputStream fout = new FileOutputStream("test2.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeInt(b1.i);
		oout.writeDouble(b1.d1);
		oout.writeBoolean(b1.falg);
		oout.writeUTF(b1.s1);
		
		oout.flush();
		oout.close();
		
		System.out.println("Externalization Done");
		System.out.println("--------------------");
	}

	@SuppressWarnings(value =  {"resource" })
	private static void doDeExternalize() throws Exception{

		FileInputStream fin = new FileInputStream("test2.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		int i = oin.readInt();
		double d = oin.readDouble();
		Boolean b1 = oin.readBoolean();
		String s1 = oin.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s1);
		System.out.println(b1);
		System.out.println("De-Externalization Done");
		System.out.println("-----------------------");
	}
}
