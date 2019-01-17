package serialisation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Util {

	public static void serialise(Object o1, String fileName)
	{
		FileOutputStream fout;
		ObjectOutputStream oout;
		try {
			
			fout = new FileOutputStream(fileName);
			 oout = new ObjectOutputStream(fout);
			oout.writeObject(o1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Object deSerialise(String fileName)
	{
		FileInputStream fin;
		ObjectInputStream oin;
		Object o1 = null;
		
		try {
			fin = new FileInputStream(fileName);
			oin = new ObjectInputStream(fin);
			o1 = (Object)oin.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o1;
	}
}
