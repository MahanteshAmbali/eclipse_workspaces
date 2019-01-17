package com.lara.afterAdvice;

public class GreetingImpl implements Greeting{

	public String sendGreeting(String s1) {
		
		System.out.println("from greeting()");
		
		return "Hello"+s1;
	}
}
