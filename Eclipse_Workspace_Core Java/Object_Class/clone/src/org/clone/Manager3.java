package org.clone;

public class Manager3 implements Cloneable{

	public int i;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Manager3 m1 = new Manager3();
		m1.i = 120;
		System.out.println(m1.i);
		
		Manager3 m2 = (Manager3)m1.clone();
		System.out.println(m2.i);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1 == m2);		
	}

}
