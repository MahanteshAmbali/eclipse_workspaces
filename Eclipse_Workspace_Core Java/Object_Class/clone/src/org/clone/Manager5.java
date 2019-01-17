package org.clone;

public class Manager5 implements Cloneable{

	private int i;
	
	public Manager5(int i){
		
		this.i = i;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		Manager5 m1 = new Manager5(1000);
		
		Manager5 m2 = (Manager5)m1.clone();
		m2.i = 2000;
		
		Manager5 m3 = (Manager5)m1.clone();
		m3.i = 3000;
		
		System.out.println(m1.i);
		System.out.println(m2.i);
		System.out.println(m3.i);
	}
}
