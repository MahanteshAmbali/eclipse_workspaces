package org.externalisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	
	int i;
	double j;
	A(int i, double j){
		
		this.i = i;
		this.j = j;
	}
}

public class Manager1 {

	public static void main(String[] args) throws Exception{
	
		A a1 = new A(10,20.00);
		FileOutputStream fout = new FileOutputStream("test1.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		
		oout.writeInt(a1.i);
		oout.writeDouble(a1.j);		
		oout.writeDouble(a1.j);		
		
		oout.flush();
		oout.close();
		System.out.println("------------------Writing Done-------------------");
		FileInputStream fin = new FileInputStream("test1.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		int p = oin.readInt();
		double q = oin.readDouble();
		
		System.out.println("--------------------Reading values---------------");
		System.out.println(p + ", "+q);
		
	}

}
