package com.lara;

class A{
	void test1(){
		synchronized (this) {
			try{
				wait();
			}catch(InterruptedException x){
				x.printStackTrace();
			}
		}
	}
	
	void test2(){
		synchronized (this) {
			notifyAll();
		}
	}
}

class B extends Thread{
	A obj;
	B(A obj){
		this.obj = obj;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run begin");
		obj.test1();
		System.out.println("run end");
	}
}

public class Manager3 {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B(a1);
		b1.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		a1.test2();
	}
}
