package com.first;

import javax.swing.plaf.SliderUI;

class A extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class B extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 10; i < 20; i++) {
			System.out.println(i);
		}
	}
}

public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		B b1 = new B();
		System.out.println(a1.getState());		//State before start 
		
		a1.start();
		b1.start();
		System.out.println(a1.getState());		//State after start
		
		try {									//State during wait
			a1.wait();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(a1.getState());
		
		Thread.currentThread().notifyAll();
		System.out.println(a1.getState());
		
		try {
			a1.sleep(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(a1.getState());		//State during sleep 
		
		try {
			a1.join();
			b1.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(a1.getState());			//State during join
	}

}
