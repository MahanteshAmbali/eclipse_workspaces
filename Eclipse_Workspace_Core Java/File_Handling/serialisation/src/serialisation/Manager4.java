package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class D implements Serializable{
	
	int i;
	static int j;
	
}

public class Manager4 {

	public static void main(String[] args) throws Exception{

		serialize();
		deSerialize();
	}

	private static void serialize() throws Exception{

		FileOutputStream fout = new FileOutputStream("test4.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		D d1 = new D();
		d1.i = 100;
		d1.j = 200;

		oout.writeObject(d1);
		
	}

	private static void deSerialize() throws Exception{
		FileInputStream fin = new FileInputStream("test4.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		D d2 = (D) oin.readObject();
		System.out.println(d2.i);
		System.out.println(d2.j);
	}

}
