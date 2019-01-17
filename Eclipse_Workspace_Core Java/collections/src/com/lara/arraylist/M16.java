package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Enumeration;

public class M16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);
		list.add(668);
		list.add(234);
		
		ArrayList list1 = new ArrayList();
		list1.add(234);
		list1.add(1234);
		list1.add(89400);
		list1.add(6768);
		list1.add(234);
		
		list.add(list1);
		
		//list.addAll(list1);
		System.out.println(list);
		list.remove(list1);
		System.out.println(list);
		//System.out.println(list.contains(list1));

	}

}
