package org.getclass;

abstract class Abst{

	public Abst() {
		
		System.out.println("From Abst()");
	}
}

public class ExerAbstract extends Abst{

	public static void main(String[] args) throws Exception {
		ExerAbstract e1 = new ExerAbstract();
		
		System.out.println("-----------------------");
		
		Class c1 = Class.forName("org.getclass.Abst");
		Abst ab1 = (Abst) c1.newInstance();
		
	}
}
