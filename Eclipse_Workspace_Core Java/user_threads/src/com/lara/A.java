package com.lara;

class B1 extends Thread{
	public void run(){
		System.out.println("run() start");
	
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
		System.out.println("run() end");
	}
}
public class A{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main()");
		
		B1 b1 = new B1();
		Thread t2 = new Thread(b1);
		//t2.setDaemon(true);
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
