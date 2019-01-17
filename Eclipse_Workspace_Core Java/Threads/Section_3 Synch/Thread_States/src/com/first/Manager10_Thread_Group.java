package com.first;

class L extends Thread{
	public L(ThreadGroup t, String s){
		super(t, s);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

class M implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 100; i < 200; i++) {
			System.out.println(i);
		}
	}
}

public class Manager10_Thread_Group {

	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup("first group");
		
		L l1 = new L(tg, "first thread");
		L l2 = new L(tg, "second thread");
		
		l1.start();
		l2.start();
		
	}
}
