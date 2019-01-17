package com.lara.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class M23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		HashSet set = new HashSet();
		
		set.add(1234);
		set.add(4321);
		set.add("abc");
		set.add("sagar");
		set.add(394);
		set.add(31234);
		
		Iterator it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next() + ", ");
		}
		
		System.out.println(set);
	}

}
