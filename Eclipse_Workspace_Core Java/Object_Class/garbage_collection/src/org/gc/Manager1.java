package org.gc;

class A{
	
	A i;
}

public class Manager1 {

	public static void main(String[] args) {
	
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a1.i = a2;
		a2.i = a3;
		a3.i = a1;
		
		a1 = a2 = a3 = null;
		
		System.out.println("Done");
	}
}
