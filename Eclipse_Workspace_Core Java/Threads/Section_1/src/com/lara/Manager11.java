package com.lara;

class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("In Thread2");
		for(int i = 1000; i < 2000; i++)
			System.out.println(i);
	}
}

class MyRunnable2 implements Runnable
{
	public void run()
	{
		System.out.println("in My runnable2");
		for(int i = 2000; i < 3000; i++)
			System.out.println(i);
	}
}


public class Manager11 
{
	public static void main(String[] args) 
	{
		Thread2 t1 = new Thread2();
		t1.start();
		
		MyRunnable2 mr = new MyRunnable2();
		Thread t2 = new Thread(mr);
		
		t2.start();
		
		System.out.println("in main");
		for(int i = 0; i < 1000; i++)
			System.out.println(i);
	}

}
