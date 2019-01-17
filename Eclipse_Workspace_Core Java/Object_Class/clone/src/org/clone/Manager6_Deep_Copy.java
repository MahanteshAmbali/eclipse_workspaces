//TO DEMONSTRATE DEEP COPY

package org.clone;

public class Manager6_Deep_Copy implements Cloneable {

	int i;
	String s1;
	Boolean flag;
	double j;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Manager6_Deep_Copy m1 = new Manager6_Deep_Copy();
		m1.i = 100;
		m1.j = 123.23;
		m1.flag = false;
		m1.s1 = "Mahantesh";
/*		
		System.out.println(m1.i);
		System.out.println(m1.j);
		System.out.println(m1.flag);
		System.out.println(m1.s1);
		
		System.out.println("----------------------------------");*/
		
		Manager6_Deep_Copy m2 = (Manager6_Deep_Copy)m1.clone();
		m2.i = 200;
		m2.j = 45667.345;
		m2.flag = true;
		m2.s1 = "Ambali";
		
		System.out.println(m2.i);
		System.out.println(m2.j);
		System.out.println(m2.flag);
		System.out.println(m2.s1);
		System.out.println("----------------------------------");
		
		System.out.println("Once again displaying m1 details: ");
		System.out.println("----------------------------------");
		
		System.out.println(m1.i);											// DEEP COPY
		System.out.println(m1.j);
		System.out.println(m1.flag);
		System.out.println(m1.s1);
		System.out.println("----------------------------------");
	}
}
