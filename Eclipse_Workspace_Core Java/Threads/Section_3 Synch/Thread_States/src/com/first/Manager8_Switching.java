package com.first;

class Test{
	int i;
}

class H extends Thread{
	Test t1;
	public H(Test t1) {
		// TODO Auto-generated method stub
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("1: "+t1.i);
		
		t1.i = 10;
		Util.putSleep(500);
		System.out.println("2: "+t1.i);
		
		t1.i = 20;
		Util.putSleep(500);
		System.out.println("3: "+t1.i);
		
		t1.i = 30;
		Util.putSleep(500);
		System.out.println("4: "+t1.i);
		
		t1.i = 40;
	}
}

class I extends Thread{
	Test t1;
	public I(Test t1) {
		// TODO Auto-generated method stub
		this.t1 = t1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("5: "+t1.i);
		
		t1.i = 50;
		Util.putSleep(500);
		System.out.println("6: "+t1.i);
		
		t1.i = 60;
		Util.putSleep(500);
		System.out.println("7: "+t1.i);
		
		t1.i = 70;
		Util.putSleep(500);
		System.out.println("8: "+t1.i);
		
		t1.i = 80;
	}
}

public class Manager8_Switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.i = 90;
		H h1 = new H(t1);
		h1.start();
		
		Util.putSleep(200);
		
		I i1 = new I(t1);
		i1.start();
		Util.putSleep(10000);
		System.out.println("9: "+t1.i);
	}
}
