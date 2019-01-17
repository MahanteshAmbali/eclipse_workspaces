package com.lara;

public abstract class SimpleAbstraction {

	public SimpleAbstraction() {
	
	}
	
	public void method1(){
	
	}
	
	public abstract void method2();
}

interface Hello{
	void method3();	//public static abstract
	
	int i = 0;		// public static final	
}

class ExtendsAbstraction extends SimpleAbstraction implements Hello
{
	
	public ExtendsAbstraction() {
		// TODO Auto-generated constructor stub
	} 

	@Override
	public void method2() {
		ExtendsAbstraction e1 = new ExtendsAbstraction();
		System.out.println(e1.i);
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
	
}