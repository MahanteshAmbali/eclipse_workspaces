package com.lara.arraylist;

import java.util.ArrayList;

public class M13 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		
		ArrayList list1 = new ArrayList();
		list1.add(894);
		list1.add(6768);
		list1.add(234);
		
		list.retainAll(list1);
		
		System.out.println(list);
		System.out.println(list1);
	}

}
