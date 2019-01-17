package com.lara;

interface A{

	void method1();
}

abstract class B{
	int i;
}


public class SimpleOverrideCheck implements A{

	@Override
	public void method1() {
		
	}
	
	
	public static void main(String[] args) {
		
		A a1 = new A() {

			@Override
			public void method1() {

				System.out.println("HELLO FROM ANONYMOUS INNER CLASS OBJECT");
			}
		};
		
		a1.method1();
		B b1 = new B() {
		};
		
		b1.i = 100;
		System.out.println(b1.i);
	}
}
