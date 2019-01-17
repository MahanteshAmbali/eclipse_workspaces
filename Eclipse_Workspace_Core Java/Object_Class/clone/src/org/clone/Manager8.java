package org.clone;

class Util{
	
	int i;
}

public class Manager8 implements Cloneable{

	int k;
	Util a1;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Manager8 m1 = new Manager8();
		m1.k = 10;
		m1.a1 = new Util();
		m1.a1.i = 20;
		
		Manager8 m2 = (Manager8)m1.clone();
		System.out.println(m2.k);
		System.out.println(m2.a1.i);

		System.out.println("------------");
		m1.k = 30;
		m1.a1.i = 40;
		
		System.out.println(m2.k);
		System.out.println(m2.a1.i);
	}

}
