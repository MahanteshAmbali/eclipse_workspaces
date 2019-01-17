package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class M20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("xyz");
		list.add("afasdf");
		list.add("benr");
		list.add(12);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
