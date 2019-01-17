package org.clone;

class A implements Cloneable{
	int i;

	public void cloneUsage() {
		// TODO Auto-generated method stub
		try {
			A a1 = (A)clone();
			System.out.println(a1.i);
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

public class Manager1 {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.i = 1000;
		obj.cloneUsage();
	}
}
