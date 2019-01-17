package com.lara.hashSet;

import java.util.HashSet;

class A{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello World.!";
	}
}

public class M18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set1 = new HashSet();
		set1.add(90);
		set1.add(90);
		System.out.println(set1);

		HashSet set2 = new HashSet();
		set2.add(true);
		set2.add(true);
		System.out.println(set2);
		
		HashSet set3 = new HashSet();
		set3.add("abc");
		set3.add("abc");
		System.out.println(set3);
		
		HashSet set4 = new HashSet();
		set4.add(new StringBuffer("abc"));
		set4.add(new StringBuffer("abc"));
		System.out.println(set4);
			
		HashSet set5 = new HashSet();
		set5.add(new A());
		set5.add(new A());
		System.out.println(set5);
		
		
	}

}
