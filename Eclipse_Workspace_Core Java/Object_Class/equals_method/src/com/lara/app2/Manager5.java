package com.lara.app2;

class J{
	int i;
	J(int i){
		this.i = i;
	}
	
}

class K{
	J j1;
	int j;
	
	K(J j1, int j){
		this.j = j;
		this.j1 = j1;
	}
	
	@Override
	public boolean equals(Object arg0) {
	
		K obj1= (K)arg0;
		
		return ((obj1.j == this.j) && (obj1.j1.i == j1.i));	
	}
}

public class Manager5 {

	public static void main(String[] args) {

		J j1 = new J(90);
		
		K k1 = new K(j1, 90);
		K k2 = new K(j1, 90);
		
		System.out.println(k1.equals(k2));
		
		K k3 = new K(null, 90);
		System.out.println(k1.equals(k3));
	}
}