package com.lara.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		list.add(new Integer(10));
		list.add(new String("abc"));
		list.add(new Double(10.22));
		
		System.out.println(list);
	}

}
