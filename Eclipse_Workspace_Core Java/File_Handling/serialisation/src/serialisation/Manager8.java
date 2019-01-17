package serialisation;

import java.io.Serializable;

class J implements Serializable{
	
	int i;
	
	public J() {
	
		System.out.println("J()");
	}
}

public class Manager8 {

	public static void main(String[] args)
	throws Exception
	{
	
		J j1 = new J();
		j1.i = 10;
		
		Util.serialise(j1, "test8.txt");
		System.out.println("---------");
		
		J j2 = (J) Util.deSerialise("test8.txt");
		System.out.println(j2.i);
	}
}
