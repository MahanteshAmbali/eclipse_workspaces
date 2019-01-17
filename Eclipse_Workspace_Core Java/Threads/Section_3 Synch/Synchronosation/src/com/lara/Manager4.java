package com.lara;

class Thread1 extends Thread{
	
	@Override
	synchronized public void run() {
		System.out.println("RUN BEGIN");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("RUN END");
	}
}

public class Manager4 {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		synchronized (t1) {
			t1.notifyAll();
		}

	}

}
