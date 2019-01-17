package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class M39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(324);
		list.add(32054332);
		list.add(5467);
		list.add(3123);
		
		ListIterator listIt = list.listIterator();
		listIt.add(null);
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		
		System.out.println();
		System.out.println(list);
	}

}
