package org.getclass;

class A{
	
}

public class Manager1 {

	public static void main(String[] args) {
	
		A a1 = new A();
		A a2 = new A();
		
		Class c1 = a1.getClass();
		Class c2 = a2.getClass();
		
		System.out.println(c1 == c2);
		System.out.println(a1 == a2);
	}
}
