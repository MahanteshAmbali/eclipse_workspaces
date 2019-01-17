package com.lara.arraylist;

import java.util.ArrayList;

public class Manager6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(300.300);
		list1.add("safasdf");
		
		ArrayList list2 = new ArrayList();
		
		try {
			list2.addAll(0,list1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(list1);
		System.out.println(list2);
	}

}
