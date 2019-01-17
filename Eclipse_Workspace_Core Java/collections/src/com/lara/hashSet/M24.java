package com.lara.hashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class M24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add(231244);
		set.add(2321);
		set.add(342);
		set.add(4950);
		
		System.out.println(set);
		
		TreeSet trSet = new TreeSet(set);
		
		System.out.println(trSet);
	}

}
