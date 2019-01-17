package com.day1.beans;

public class Test {

	public String param1;

	public Test() {
	
		System.out.println("Test()");
		System.out.println("-----------------------");
	}
	
	public String getParam1() {
		System.out.println("-----------------------");
		System.out.println("Getter");
		System.out.println("-----------------------");
		return param1;
	}

	public void setParam1(String param1) {
		System.out.println("-----------------------");
		System.out.println("Setter");
		System.out.println("-----------------------");
		this.param1 = param1;
	}
	
	
}
