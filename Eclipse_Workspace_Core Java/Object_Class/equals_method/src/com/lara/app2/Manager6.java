package com.lara.app2;

class L{
	
	int i;
	
	L(int i){
		this.i = i;
	}
}

class M{
	
	L l1;
	int j;
	
	M(L l1, int j){
		this.l1 = l1;
		this.j = j;
	}
	
	@Override
	public boolean equals(Object arg0) {
		
		M m1 = (M)arg0;
		return ((m1 instanceof M) && (m1.l1 != null) && (m1.l1.i == l1.i) && (m1.j == this.j));
	}
}

public class Manager6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		L l1 = new L(100);
		
		M m1 = new M(l1, 100);
		M m2 = new M(l1, 100);
		M m3 = new M(null, 100);
		
		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m3));
		System.out.println(m1.equals(l1));
	}
}
