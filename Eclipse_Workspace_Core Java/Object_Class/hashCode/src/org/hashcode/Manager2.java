package org.hashcode;

class B{
	int i;
}

public class Manager2 {

	public static void main(String[] args) {
		
		B b1 = new B();
		B b2 = b1;
		
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}
