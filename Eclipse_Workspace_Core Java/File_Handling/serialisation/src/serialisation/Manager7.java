package serialisation;

import java.io.Serializable;

class I implements Serializable{
	int i;
}

public class Manager7 {

	public static void main(String[] args)
	throws Exception
	{
		I i1 = new I();
		i1.i = 10;
		
		Util.serialise(i1, "test7.txt");
		System.out.println("---------");
		
		I i2 = (I)Util.deSerialise("test7.txt");
		System.out.println(i2.i);
	}
}
