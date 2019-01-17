package com.first;

class D extends Thread{
	Thread main;
	public D(Thread main) {
		this.main = main;
	}

	@Override
	public void run() {
		System.out.println("RUN BEGIN");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(main.getState());
	}
}

public class Manager4_State_During_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread main = Thread.currentThread();
		D d1 = new D(main);
		d1.start();
		
		try {
			d1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("EnD");
	}

}
