package com.lara.app1;

class L{
	
	int i;
}

public class Manager12 {

	public static void main(String[] args) {
		
		L l1 = new L();
		l1.i = 100;
		
		L l2 = new L();
		l2.i = 100;
		
		System.out.println(l1 == l2);
	}

}
