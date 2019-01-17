package com.lara;

public class MainThread {

	synchronized public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Inside test1()");
		try {
			wait();
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test1 end");
	}

	synchronized public void test2() {
		// TODO Auto-generated method stub
		notifyAll();
	}

	
}
