package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class M38 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(324);
		list.add(32054332);
		list.add(5467);
		list.add(3123);
		
		ListIterator listIt = list.listIterator();
		Collections.sort(list);
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		list.add(3934);
		System.out.println();
		System.out.println(list);
	}

}
