package org.gc;

class B{
	int i;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize");
	}
	
	public B() {
	
	}
	
	public B(int i){
		this.i = i;
	}
	public void test1(){
		System.out.println("From B-test");
	}
}

public class Manager2 {

	public static void main(String[] args) throws Exception {
	/*
		B b1 = new B();
		b1 = null;
//		
//		System.gc();
		
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.freeMemory());
		
		rt.gc();
		System.out.println(rt.maxMemory());
		System.out.println(rt.freeMemory());
		
		System.out.println("done");*/
		
		Class c1 = Class.forName("org.gc.B");
		B b2 = (B)c1.newInstance();
		b2.test1();
	}
}
