package com.lara;

public class Thread2 extends Thread{

	MainThread mainThread;

	public Thread2(MainThread mainThread) {
		// TODO Auto-generated constructor stub
		this.mainThread = mainThread;
	}
	
	@Override
	public void run() {

		mainThread.test1();
		
	}
}
