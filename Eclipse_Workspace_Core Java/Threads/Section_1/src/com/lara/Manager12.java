package com.lara;

import java.lang.Thread.State;
import java.util.Arrays;

class D1 extends Thread
{
	public void run()
	{
		for(int i = 0; i<1000; i++)
			System.out.println(i);
	}	
}

public class Manager12
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		D1 d1 = new D1();
		
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total memory: "+runtime.totalMemory());
		/*D1 d3 = new D1();
		//d3.start();
		D1 d2 = new D1();
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getId());
		
		System.out.println(d1.getId());
		System.out.println(d2.getId());
		System.out.println(d3.getId());
		
		StackTraceElement st[] = d1.getStackTrace();
		System.out.println(Arrays.toString(st));
		
		State state = d1.getState();
		System.out.println(state);
		*/
		//d2.start();
		d1.join();
		d1.start();
		d1.
		for (int i = 11; i < 20; i++) {
			System.out.println(i);
		}
		System.out.println("in main");
	}
}
