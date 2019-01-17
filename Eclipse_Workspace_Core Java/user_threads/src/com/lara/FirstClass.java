package com.lara;

public class FirstClass extends Thread{

	Shared s1, s2;
	public FirstClass(Shared s1, Shared s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run() {
		s1.test1(s2);
	}
}
