package com.lara.beans;

public class Test {

	private String param1;
	
	public Test() {
		System.out.println("Test()");
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		
		System.out.println("Test setter method");
		this.param1 = param1;
	}
	
	
}
