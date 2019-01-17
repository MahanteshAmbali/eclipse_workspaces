package com.lara;

public class A1 extends Thread{

	ThreadLocal t1;
	A1(ThreadLocal t1){
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(t1.get());
	}
}
