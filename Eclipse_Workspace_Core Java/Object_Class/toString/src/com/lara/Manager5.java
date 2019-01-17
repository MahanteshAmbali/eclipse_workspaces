package com.lara;

class E{

	int i, j;
	public E(int i, int j) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;		
	}
}

public class Manager5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E e1 = new E(10,20);
		E e2 = new E(10,20);
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
