package com.lara.arraylist;

import java.util.ArrayList;

public class M9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(90);
		list1.add(123123213);
		list1.add(90);
		list1.add(300.300);
		list1.add(123123213);
		list1.add(300.300);
		list1.add("asdfa");
		list1.add("safasdf");
		list1.add("safasdf");
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2.add(123123213);
		list2.add("asdfa");
		list2.add(list1);
		System.out.println(list2);
		System.out.println(list2.get(2));
		
		list1.remove(list2);
		System.out.println(list1);
	}

}
