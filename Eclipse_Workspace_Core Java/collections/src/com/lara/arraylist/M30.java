package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class M30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);
		list.add(6768);
		list.add(234);
		
		System.out.println(list);
		System.out.println("----------");
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		
		System.out.println();
		System.out.println("-------------");
		
		ListIterator listIt = list.listIterator();
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		
	}

}
