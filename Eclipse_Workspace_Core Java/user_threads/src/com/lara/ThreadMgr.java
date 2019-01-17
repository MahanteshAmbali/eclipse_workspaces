package com.lara;

public class ThreadMgr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainThread mainThread = new MainThread();
		Thread1 thread1 = new Thread1(mainThread);
		Thread2 thread2 = new Thread2(mainThread);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("About to release");
		mainThread.test2();
		thread1.getState();
	}

}
