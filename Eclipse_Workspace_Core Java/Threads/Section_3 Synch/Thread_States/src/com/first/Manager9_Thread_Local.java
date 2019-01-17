package com.first;

class J extends Thread{
	ThreadLocal t;
	J(ThreadLocal t){
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1: "+t.get());
		Util.putSleep(500);
		
		t.set(10);
		Util.putSleep(500);
		System.out.println("2: "+t.get());
		
		t.set(20);
		Util.putSleep(500);
		System.out.println("3: "+t.get());
		
		t.set(30);
		Util.putSleep(500);
		System.out.println("4: "+t.get());
		t.set(40);
	}
}

class K extends Thread{
	ThreadLocal t;
	K(ThreadLocal t){
		this.t = t;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("5: "+t.get());
		Util.putSleep(500);
		
		t.set(50);
		Util.putSleep(500);
		System.out.println("6: "+t.get());
		
		t.set(60);
		Util.putSleep(500);
		System.out.println("7: "+t.get());
		
		t.set(70);
		Util.putSleep(500);
		System.out.println("8: "+t.get());
		t.set(80);
	}
}

public class Manager9_Thread_Local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ThreadLocal t1 = new ThreadLocal();
		J j1 = new J(t1);
		j1.start();
		Util.putSleep(250);
		
		K k1 = new K(t1);
		k1.start();
		Util.putSleep(250);
		
		System.out.println("9: "+t1.get());
	
		Util.putSleep(3000);
		
		t1.set(90);
		System.out.println("10: "+t1.get());
	}
}
