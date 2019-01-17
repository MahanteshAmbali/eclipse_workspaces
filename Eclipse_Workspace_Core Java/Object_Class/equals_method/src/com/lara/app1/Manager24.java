package com.lara.app1;

class X{
	int i;
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return ((X)arg0).i == this.i;
	}
}

class Y{
	int j;
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return ((Y)arg0).j == this.j;
	}
}

public class Manager24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x1 = new X();
		x1.i = 100;
		
		Y y1 = new Y();
		y1.j = 100;
		
		//System.out.println(x1 == y1);
		System.out.println(x1.i == y1.j);
		
		System.out.println(x1.equals(y1));
		System.out.println(y1.equals(x1));
	}

}
