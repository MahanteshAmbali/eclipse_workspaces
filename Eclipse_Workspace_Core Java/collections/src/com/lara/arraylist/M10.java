package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class M10 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList();
		list1.add(78);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(8);
		list1.add(78);
		list1.add(2134);
		list1.add(0);
		list1.add(21);
		
		Iterator iterator = list1.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		int freq = Collections.frequency(list1, 78);
		Object obj = Collections.max(list1);
		List list4 = Collections.nCopies(3, list1.getClass());
		System.out.println(list1);
		System.out.println(freq);
		System.out.println(obj);
		System.out.println(list4);
	}

}













