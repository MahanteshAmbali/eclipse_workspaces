package com.lara;

class A{
	
	int i;
	double d;
	String s1;
	char c1;
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("In finalize method");		
	}
}

public class object_memory {

	public static void main(String[] args) {

		//long bValue = 0, aValue = 0;
	
		A a1 = new A();
		
		Runtime rc = Runtime.getRuntime();
		
	/*	bValue = rc.freeMemory();	
		System.out.println("Memory b4 GC: "+rc.freeMemory());
		
		rc.gc();
		
		aValue = rc.freeMemory();
		System.out.println("Memory af GC: "+rc.freeMemory());*/
		
		System.out.println("Memory acquired by object: "+(rc.totalMemory() - rc.freeMemory())+ " bytes");
		
	}

}
