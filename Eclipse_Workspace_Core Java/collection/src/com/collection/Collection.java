package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection extends ArrayList{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(0,new Integer(10));
		list.add(1,new Integer(20));
		list.add(2,new Integer(30));
		list.add(3,new Integer(40));
		list.add(4,new Integer(50));
		list.add(5,new Integer(60));
		list.add(6,new Integer(70));
		
		Collection collection = new Collection();
		collection.add(new Integer(10));
		collection.add(new Integer(50));
		collection.add(new Integer(60));
		collection.add(new Integer(40));
		collection.add(new Integer(20));
		collection.add(new Integer(30));
		collection.add(new Integer(70));
		collection.add(new String("ab"));
		
		Collections.sort(list);
		System.out.println(list);
		Comparator comparator = Collections.reverseOrder();
		Collections.sort(list, comparator);
		System.out.println(list);
		
	}
}
