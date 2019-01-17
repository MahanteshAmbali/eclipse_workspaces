package com.lara.app1;

class P{
	
	int i;
	
	public P(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
}

public class Manager16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P p1 = new P(100);
		P p2 = new P(100);
		P p3 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p1);
		System.out.println(p1.i == p2.i);
		System.out.println(p3.i == p2.i);
	}

}
