package com.lara.app1;

class V{
	
	int i, j;
	
	public V(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public boolean equals(Object arg0){
		
		boolean flag = (((V)arg0).i == this.i  && ((V)arg0).j == this.j);
		return flag;
	}
}

public class Manager22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		V v1 = new V(100,110);
		V v2 = new V(100,110);
		
		System.out.println(v1.equals(v2));
	}
}
