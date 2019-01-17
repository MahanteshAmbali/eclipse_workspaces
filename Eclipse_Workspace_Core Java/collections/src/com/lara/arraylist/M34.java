package com.lara.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;

public class M34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);
		list.add(6768);
		list.add(234);
		list.add(500);
		
		ListIterator it = list.listIterator();
		list.add(3040);
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
/*		HashMap map=new HashMap();
		
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 1);
		map.put(4, 1);
		map.put(5, 1);
		map.put(6, 1);
		map.put(7, 1);
		Iterator it1=map.entrySet().iterator();
		map.put(9, 66);
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}*/
	}

}
