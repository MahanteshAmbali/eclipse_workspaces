package org.getclass;

class I{
	void test(){
		System.out.println("From Test");
	}
}

public class Manager7 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		I i1 = new I();
		Class c1 = i1.getClass();
		
		I i2 = (I)c1.newInstance();
		i2.test();
	}

}
