package com.first;

class C extends Thread{
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		try {
//			sleep(10000);
			wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("End");
	}
}

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		c1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(c1.getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		synchronized (c1) {
			c1.notify();
		}
	}

}
