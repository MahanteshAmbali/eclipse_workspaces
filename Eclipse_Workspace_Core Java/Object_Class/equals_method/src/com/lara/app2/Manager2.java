package com.lara.app2;

class D{
	int i;
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		D d1 = (D)arg0;
		boolean flag = (d1.i == this.i);
		return flag;
	}
}

class E{
	int j;
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		E e1 = (E)arg0;
		boolean flag = e1.j == this.j;
		return flag;
	}
}

public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D d1 = new D();
		d1.i = 10;
		
		D d2 = new D();
		d2.i = 10;
		
		E e1 = new E();
		e1.j = 10;
		
		E e2 = new E();
		e2.j = 10;
		
		System.out.println(d1.equals(d2));
		System.out.println(e1.equals(e2));
		
		System.out.println("-----------");
		
		//System.out.println(d1.equals(e1));
		//System.out.println(e1.equals(d1));
	}

}
