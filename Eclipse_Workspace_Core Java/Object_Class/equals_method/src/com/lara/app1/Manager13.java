package com.lara.app1;

class M{
	
	int i;
	
	public M(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}
}

public class Manager13 {

	public static void main(String[] args) {
		
		M m1 = new M(100);
		M m2 = new M(100);
		
		System.out.println(m1 == m2);
	}

}
