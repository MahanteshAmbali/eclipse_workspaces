package com.lara.app1;

class R{
	
	int i;
	
	public R(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
}

public class Manager18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R r1 = new R(100);
		R r2 = new R(100);
		
		System.out.println(r1 == r2);
		System.out.println(r1.i == r2.i);
		System.out.println(r1.equals(r2));
	}
}
