package com.lara.arraylist;

import java.util.ArrayList;

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(true);
		list.add("dell");
		list.add(10.00);
		
		int i = list.size();
		for (int j = 0; j < i; j++) {
			System.out.println(list.get(j));
		}
	}

}
