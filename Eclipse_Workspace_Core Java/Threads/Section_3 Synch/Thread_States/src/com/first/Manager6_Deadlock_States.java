package com.first;

class Util extends Thread{
	
	public static void putSleep(long num){
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class Shared{
	synchronized public void test1(Shared s){
		System.out.println(1);
		Util.putSleep(2000);
		s.test2(this);
		System.out.println(2);
	}

	synchronized public void test2(Shared s){
		System.out.println(3);
		Util.putSleep(2000);
		s.test1(this);
		System.out.println(4);
	}
	
	synchronized public void test3(){
		notify();
	}
}

class Thread1 extends Thread{
	Shared s1, s2;
	public Thread1(Shared s1, Shared s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		s1.test1(s2);
	}
}

class Thread2 extends Thread{
	Shared s1, s2;
	public Thread2(Shared s1, Shared s2) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		s2.test1(s1);
	}
}

public class Manager6_Deadlock_States {

	public static void main(String[] args) {
	
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		Thread1 t1 = new Thread1(s1, s2);
		Thread2 t2 = new Thread2(s1, s2);
		
		t1.start();
		t2.start();
				
		Util.putSleep(10000);
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		
		Util.putSleep(5000);
		
		s1.test3();
		s2.test3();
				
		System.out.println(t1.getState());
		System.out.println(t2.getState());
	}
}
