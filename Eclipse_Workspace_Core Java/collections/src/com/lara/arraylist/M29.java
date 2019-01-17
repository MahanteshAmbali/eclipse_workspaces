package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class M29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);
		list.add(6768);
		list.add(234);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}

}
