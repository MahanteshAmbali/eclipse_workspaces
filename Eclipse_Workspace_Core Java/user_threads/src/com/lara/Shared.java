package com.lara;

public class Shared {

	synchronized public void test1(Shared s2) {
		// TODO Auto-generated method stub
		System.out.println("Inside test1()");
		Util.sleep(2000);
		s2.test2(this);
		System.out.println("test1() end");
	}

	synchronized public void test2(Shared shared) {
		// TODO Auto-generated method stub
		System.out.println("Inside test2()");
		Util.sleep(2000);
		shared.test1(this);
		System.out.println("test2() end");
	}
}
