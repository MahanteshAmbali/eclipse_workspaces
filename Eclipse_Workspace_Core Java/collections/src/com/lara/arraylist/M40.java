package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class M40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(324);
		list.add(32054332);
		list.add(5467);
		list.add(3123);
		
		ListIterator listIt = list.listIterator();
		
		while(listIt.hasNext()){
			Object o1 = listIt.next();
			if(o1.equals(3123)){
				listIt.set("abc");
			}
			System.out.print(o1+", ");
		}
		
		System.out.println();
		System.out.println(list);
	}

}
