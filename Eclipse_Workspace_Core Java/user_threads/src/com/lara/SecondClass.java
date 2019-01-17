package com.lara;

public class SecondClass extends Thread{

	Shared s1, s2;
	public SecondClass(Shared s1, Shared s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run() {
		s2.test2(s1);
	}
}
