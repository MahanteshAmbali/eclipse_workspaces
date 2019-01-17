package com.lara;

public class simple_hread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
	
		simple_hread t1 = new simple_hread();
		Thread thread = new Thread(t1);
		
		thread.start();
		Thread.dumpStack();
		
	}

}
