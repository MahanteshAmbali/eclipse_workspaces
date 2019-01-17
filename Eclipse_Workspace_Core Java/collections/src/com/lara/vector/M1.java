package com.lara.vector;

import java.util.Enumeration;
import java.util.Vector;

public class M1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		vector.add(23);
		vector.add(32423);
		vector.add(567);
		vector.add(8998);
		System.out.println(vector);
		
		Enumeration enum1 = vector.elements();
		while (enum1.hasMoreElements()) {
			Object object = (Object) enum1.nextElement();
			System.out.println(object);
		}
	}

}
