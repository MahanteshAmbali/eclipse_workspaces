package org.externalisation;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person implements Externalizable{
	
	String name;
	int age;
	double weight;
	
	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
	
		arg0.writeInt(age);
		arg0.writeUTF(name);
		arg0.writeDouble(weight);
		
	}
	
	@Override
	public void readExternal(ObjectInput arg0) throws IOException,
			ClassNotFoundException {
	
		age = arg0.readInt();
		name = arg0.readUTF();
		weight = arg0.readDouble();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: "+ name + " Age: "+ age + " Weight: "+weight;
	}
}

public class Manager8 {

	public static void main(String[] args) {
	
		externalize();
		deExternalize();
	}

	private static void externalize() {

		FileOutputStream fout;
		ObjectOutputStream oout = null;

		Person firstPerson = new Person();
		firstPerson.age = 27;
		firstPerson.name = "Mahantesh";
		firstPerson.weight = 80;
		
		try {
			
			fout = new FileOutputStream("test8.txt");
			oout = new ObjectOutputStream(fout);
			firstPerson.writeExternal(oout);
			
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
	}

	private static void deExternalize() {

		FileInputStream fin;
		ObjectInputStream oin = null;
		Person firstCopyPerson = new Person();
		
		try {
			
			fin = new FileInputStream("test8.txt");
			oin = new ObjectInputStream(fin);
			firstCopyPerson.readExternal(oin);
			
			System.out.println("Copy of first peason into second person obj");
			System.out.println(firstCopyPerson);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}