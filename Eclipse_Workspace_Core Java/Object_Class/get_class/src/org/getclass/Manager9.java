package org.getclass;

class K{
	
	public K() {
		// TODO Auto-generated constructor stub
		System.out.println("K()");
	}
	
	void test(){
		System.out.println("From Test");
	}
}

public class Manager9 {

	public static void main(String[] args) throws ClassNotFoundException,Exception {

		Class c1 = Class.forName("org.getclass.K");
		
		K k1 = (K)c1.newInstance();
		k1.test();
		
		System.out.println("-------------");
		K k2 = (K)c1.newInstance();
		k2.test();
	}

}
