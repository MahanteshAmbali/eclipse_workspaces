package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class M27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("sagar");
		list.add("indigo");
		list.add("yellow");
		
		System.out.println(list);
		System.out.println("---------");
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("---------");
		
		int flag = Collections.binarySearch(list, "tulip");
		System.out.println(flag);
	}

}
