package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class E implements Serializable{
	
	int i;
}

class F implements Serializable{
	
	E e1;
	int j;
}

public class Manager5 {

	public static void main(String[] args)throws Exception {
		
		serialize();
		deSerialize();
	}
	
	private static void deSerialize() throws Exception {
		
		FileInputStream fin = new FileInputStream("test5.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		F f1 = (F) oin.readObject();
		System.out.println(f1.j);
		System.out.println(f1.e1.i);
	}

	private static void serialize() throws Exception{

		E e1 = new E();
		e1.i = 10;
		
		F f1 = new F();
		f1.j = 20;
		f1.e1 = e1;
		
		FileOutputStream fout = new FileOutputStream("test5.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		oout.writeObject(f1);
	}
	
	
}
