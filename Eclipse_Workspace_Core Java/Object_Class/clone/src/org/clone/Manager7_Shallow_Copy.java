package org.clone;

class Test{
	
	int i;
}

public class Manager7_Shallow_Copy implements Cloneable{

	int j;
	Test obj;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Test test1 = new Test();
		test1.i = 100;
		
		Manager7_Shallow_Copy m1 = new Manager7_Shallow_Copy();
		m1.j = 200;
		m1.obj = test1;
		
		Manager7_Shallow_Copy m2 = (Manager7_Shallow_Copy)m1.clone();
		
		System.out.println(m2.j);
		System.out.println(m2.obj.i);
		
		m2.j = 300;
		m2.obj.i = 400;
		
		System.err.println(m1.j);
		System.out.println(m1.obj.i);
	}
}
