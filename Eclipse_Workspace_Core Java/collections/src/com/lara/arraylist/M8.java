package com.lara.arraylist;

import java.util.ArrayList;

public class M8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList();
		list1.add(90);
		list1.add(300.300);
		list1.add("safasdf");
		
		ArrayList list2 = new ArrayList(list1);
		
		System.out.println(list2);
	}

}
