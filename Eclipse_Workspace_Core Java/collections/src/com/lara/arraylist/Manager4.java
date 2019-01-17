package com.lara.arraylist;

import java.util.ArrayList;

public class Manager4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(90);
		list.add(90.0);
		
		String s1 = null;
		list.add(s1.length());
		
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
