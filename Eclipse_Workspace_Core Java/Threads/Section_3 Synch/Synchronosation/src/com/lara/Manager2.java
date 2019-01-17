package com.lara;

/*class A1
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

class B1 extends Thread 
{
	A1 a1;
	B1(A1 a1)
	{
		this.a1 = a1;
	}
	@Override
	synchronized public void run() {
		// TODO A1uto-generated method stub
		//a1.test1();
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

class C1 extends Thread 
{
	A1 a1;
	C1(A1 a1)
	{
		this.a1 = a1;
	}
	
	int i;
	@Override
	synchronized public void run() {
		// TODO A1uto-generated method stub
		//a1.test1();
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
	}
}
*/
public class Manager2 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
	synchronized public static void main(String[] args) {
		//A1 a1 = new A1();
		/*B1 b1 = new B1();
		C1 c1 = new C1();
		
		b1.start();
		c1.start();*/
		Manager1 m1 = new Manager1();
		//m1.main(null);
		
	}
}