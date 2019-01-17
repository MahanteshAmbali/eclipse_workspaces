package org.clone;

public class Manager4 implements Cloneable{

	private int i;
	
	public Manager4() {
		
		System.out.println("Manager 4()");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Manager4 m1 = new Manager4();
		m1.i = 9900;
		System.out.println(m1.i);
		
		Manager4 m2 = (Manager4)m1.clone();
		m2.i = 23;
		System.out.println(m2.i);
	}
}
