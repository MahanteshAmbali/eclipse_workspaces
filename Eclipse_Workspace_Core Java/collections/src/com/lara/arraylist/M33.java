package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class M33 {

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
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals(234)){
				it.remove();
			}
		}
		System.out.println("----------");
		System.out.println(list);
	}

}
