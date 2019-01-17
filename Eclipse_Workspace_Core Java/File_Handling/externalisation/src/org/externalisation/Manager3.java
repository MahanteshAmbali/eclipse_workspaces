package org.externalisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable{
	
	int i;
	double j;
	String s1;
}

public class Manager3 {

	public static void main(String[] args) throws Exception{
		
		externalize();
		deExternalize();
	}

	private static void externalize() throws Exception{
	
		C c1 = new C();
		c1.i = 10;
		c1.j = 20.10;
		c1.s1 = "Mahantesh";
		
		FileOutputStream fout = new FileOutputStream("test3.txt");
		ObjectOutputStream oout= new ObjectOutputStream(fout);
		
		oout.writeInt(c1.i);
		//oout.writeDouble(c1.j);			// not-externalized
		oout.writeUTF(c1.s1);
		oout.flush();
		oout.close();
		
		System.out.println("Externalization Done");
	}

	private static void deExternalize() throws Exception{
	
		FileInputStream fin = new FileInputStream("test3.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		int i = oin.readInt();
		String s1 = oin.readUTF();
		
		System.out.println(i);
		System.out.println(s1);
		
		System.out.println("De-Externalization Done");
	}
}