package com.lara.arraylist;

import java.util.ArrayList;

public class Manager2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(true);
		list.add("abc");
		
		System.out.println(list.get(2));
		System.out.println(list.get(1));
	}

}
