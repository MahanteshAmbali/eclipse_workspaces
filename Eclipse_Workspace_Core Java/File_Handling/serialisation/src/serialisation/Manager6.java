package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class G implements Serializable{
	
	int i;
}

class H extends G{
	
	int j;
}

public class Manager6 {

	public static void main(String[] args) throws Exception{

		serialise();
		deserialise();
	}

	private static void serialise() throws Exception{

		FileOutputStream fin = new FileOutputStream("test6.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fin);
		H h1 = new H();
		h1.i = 10;
		h1.j = 20;
		
		oout.writeObject(h1);
	}

	private static void deserialise() throws Exception{

		FileInputStream fin = new FileInputStream("test6.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		H h1 = (H)oin.readObject();
		
		System.out.println(h1.i);
		System.out.println(h1.j);
	}

}
