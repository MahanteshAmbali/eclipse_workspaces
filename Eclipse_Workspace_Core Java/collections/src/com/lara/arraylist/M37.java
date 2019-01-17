package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(324);
		list.add(32054332);
		list.add(5467);
		list.add(3123);
		
		ListIterator listIt = list.listIterator();
		//list.add(3934);									//CONCURRENT MODIFICATION EXCEPTION
		listIt.add(3934);
		
		Iterator it1 = list.iterator();
		
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		System.out.println();
		System.out.println(list);
	}

}
