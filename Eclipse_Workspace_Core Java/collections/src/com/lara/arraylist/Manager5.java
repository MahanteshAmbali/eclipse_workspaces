package com.lara.arraylist;

import java.util.ArrayList;

public class Manager5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(2.90);
		list.add("abc");
		list.add(false);
		
		System.out.println(list);
		
		list.add(0, "sagar");
		
		System.out.println(list);
	}

}
