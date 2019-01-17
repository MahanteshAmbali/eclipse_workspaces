package com.lara;

public class ThreadLocal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal t1 = new ThreadLocal();
		t1.set(90);
		A1 a1 = new A1(t1);
		Thread t2 = new Thread(a1);
		t2.start();
		
		System.out.println(t1.get());
	}

}
