package org.hashcode;

class A{
	int i;
}

public class Manager1 {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}
