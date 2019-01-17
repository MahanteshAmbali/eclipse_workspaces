package com.lara.throwsAdvice;

public class PersonImpl implements Person{

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1() begin");
		String s1 = null;
		System.out.println(s1.length());
		System.out.println("Method1() end");
	}

	public void method2() {
		// TODO Auto-generated method stub
		
		System.out.println("Method2() begin");
		Object obj1 = new Object();
		
		String s2 = (String) obj1;
		
		System.out.println(s2);
	}

}
