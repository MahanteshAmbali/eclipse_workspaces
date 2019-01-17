package serialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	
	int i;
	double j;
	
}

class A1 extends A{
	int i1;
}

public class Manager1 {

	public static FileOutputStream fOut;
	public static ObjectOutputStream oOut;
	public static FileInputStream fIn ;
	public static ObjectInputStream oIn;
	
	public static void main(String[] args){
		
		doSerialisation();
		doDeSerialisation();
	}

	private static void doSerialisation() {

		A a1 = new A();
		a1.i = 10;
		a1.j = 20.0;
		
		A1 a2 = new A1();
		a2.i1 = 32;
		
		FileOutputStream fOut;
		try {
			fOut = new FileOutputStream("simple.txt");
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(a1);
			oOut.writeObject(a2);			
			oOut.flush();
			oOut.close();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Written to file");
	}

	
	private static void doDeSerialisation() {
		
		try{
			fIn = new FileInputStream("simple.txt");
			oIn = new ObjectInputStream(fIn);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		A a1= null;
		A1 a2 = null;
		try {
			a1 = (A) oIn.readObject();
			a2 = (A1) oIn.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a2.i1);
	}

}
