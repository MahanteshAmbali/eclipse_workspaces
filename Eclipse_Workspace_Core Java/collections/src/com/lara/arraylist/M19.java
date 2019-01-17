package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(234);
		list.add(123.4);
		list.add(894);					
		list.add(6768);
		list.add(787234);
		
		Collections.sort(list);
		System.out.println(list);
		Comparator ctr = Collections.reverseOrder();
		Collections.sort(list, ctr);
		System.out.println(list);
	}

}
