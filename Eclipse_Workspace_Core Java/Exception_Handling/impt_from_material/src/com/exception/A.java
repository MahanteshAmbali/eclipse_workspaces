package com.exception;

class Custom_Exception
{

	static void test1()
	{
		System.out.println("Custom_Exception test1()");
	}
}

public class A extends Custom_Exception 
{
	public static void main(String[] args) 
	{
		Custom_Exception obj = new Custom_Exception();
		obj.test1();
		
		A a1 = new A();
		a1.test1();
	}
	
	static void test1(){
		System.out.println("A test1()");
	}
}
