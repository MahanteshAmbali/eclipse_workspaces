package com.lara;

class C extends Thread{
	
	public void run() {
		System.out.println("-----------");
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		System.out.println("-----------");
	}
}

class D extends Thread{
	public void run() {
		System.out.println("-----------");
		for (int i = 1000; i < 2000; i++) {
			System.out.println(i);
		}
		System.out.println("-----------");
	}
}
public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new C());
		Thread t2 = new Thread(new D());
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
