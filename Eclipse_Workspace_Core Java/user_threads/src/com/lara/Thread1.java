package com.lara;

public class Thread1 extends Thread{

	MainThread mainThread;
	public Thread1(MainThread mainThread) {
		// TODO Auto-generated constructor stub
		this.mainThread = mainThread;
	}
	
	@Override
	public void run() {

		mainThread.test1();

	}
}
