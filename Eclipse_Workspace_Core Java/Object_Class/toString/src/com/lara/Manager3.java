package com.lara;

class C{
	
	int i;
	
	public C(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
}

public class Manager3 {
	
	public static void main(String[] args) {
	
		C c1 = new C(90);
		String s1 = c1.toString();
		String s2 = "address" + s1;
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
