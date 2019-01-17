package com.lara;
/*
class A
{
	synchronized void test1()
	{
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
	
	synchronized void test2()
	{
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
	}
}

class B extends Thread 
{
	A a1;
	B(A a1)
	{
		this.a1 = a1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a1.test1();
	}
}

class C extends Thread 
{
	A a1;
	C(A a1)
	{
		this.a1 = a1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		a1.test1();
	}
}

public class Manager1
{
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B(a1);
		C c1 = new C(a1);
		
		b1.start();
		c1.start();
	}
}*/

public class Manager1 extends Thread
{

	
	public static void main(String[] args) {
			Manager1 m2 = new Manager1();
		
	}
}