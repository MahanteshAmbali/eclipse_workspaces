package serialisation;

import java.io.Serializable;

class K implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int k;
	
	public K() {
	
		System.out.println("K()");
	}
}

public class Manager9 {

	public static void main(String[] args) 
	{

		K k1 = new K();
		k1.k = 100;
		
		Util.serialise(k1, "test9.txt");
		System.out.println("---------");
		
		K k2 = (K) Util.deSerialise("test9.txt");

		System.out.println(k1 == k2);
		System.out.println(k1.equals(k2));
	}

}
