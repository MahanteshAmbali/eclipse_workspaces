package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class M35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(324);
		list.add(3123);
		list.add(5467);
		list.add(32054332);
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		list.add(88399);
		System.out.println(list);
	}

}
