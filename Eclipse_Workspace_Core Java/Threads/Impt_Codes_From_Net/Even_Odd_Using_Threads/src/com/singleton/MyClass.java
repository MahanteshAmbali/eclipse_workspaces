package com.singleton;

final class Singleton {

	private final static Singleton singleton =  new Singleton();

	private Singleton(){
		
	}

	public static final Singleton getInstatnce(){
		return singleton;
	}
	
	protected void demoMethod() {
		System.out.println("From Demo Method of Singleton");
	}
}


public class MyClass extends Thread{
	
	public static void main(String[] args) {
	
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
		
	}
}