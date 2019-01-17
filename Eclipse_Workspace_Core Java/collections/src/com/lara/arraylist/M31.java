package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class M31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);
		list.add(6768);
		list.add(234);
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
//		Iterator it1 = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
