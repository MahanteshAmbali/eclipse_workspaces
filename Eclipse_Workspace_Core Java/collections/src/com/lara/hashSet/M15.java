package com.lara.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class M15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add(90);
		set.add(3);
		set.add(23);
		set.add(12);
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
