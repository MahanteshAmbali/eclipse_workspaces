package org.clone;

class M{
	
	int i;
}

public class V implements Cloneable{

	int j;
	M m1;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		V v1 = (V)super.clone();
		
		v1.m1 = new M();
		v1.m1.i = this.m1.i;
		
		return v1;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
	
		V v1 = new V();
		v1.j = 10;
		v1.m1 = new M();
		v1.m1.i = 20;
		
		V v2 = (V)v1.clone();
		System.out.println(v2.j);
		System.out.println(v2.m1.i);
		
		System.out.println("------------");
		
		v2.j = 30;
		v2.m1.i = 40;
		
		System.out.println(v1.j);
		System.out.println(v1.m1.i);
	}
}