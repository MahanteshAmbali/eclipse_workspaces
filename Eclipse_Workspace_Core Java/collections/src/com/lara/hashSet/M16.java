package com.lara.hashSet;

import java.util.HashSet;

public class M16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
	
		set.add("90");
		set.add(90.0);
		set.add(90);
	
		System.out.println(set.size());
		System.out.println(set);
	}

}
