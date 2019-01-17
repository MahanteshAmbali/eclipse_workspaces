package org.clone;

public class Manager2 implements Cloneable{

	private int i;
	
	public static void main(String[] args) throws CloneNotSupportedException{

		Manager2 m1 = new Manager2();
		m1.i = 100;
		System.out.println(m1.i);
		
		Manager2 m2 = (Manager2)m1.clone();
		System.out.println(m2.i);
	}
}
