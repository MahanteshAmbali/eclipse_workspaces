package com.lara.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class M36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(324);
		list.add(3123);
		list.add(5467);
		list.add(32054332);
		
		ListIterator listIt = list.listIterator();
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		System.out.println();
		System.out.println("-----");
		
		while(listIt.hasPrevious()){
			System.out.print(listIt.previous()+", ");
		}
		System.out.println();
		System.out.println("-----");
		
		while(listIt.hasPrevious()){
			System.out.print(listIt.previous()+", ");
		}
		System.out.println();
		System.out.println("-----");
		
		while(listIt.hasNext()){
			System.out.print(listIt.next()+", ");
		}
		System.out.println();
		System.out.println("-----");
		
	}

}
