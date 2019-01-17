package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class M28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add(234);
		list.add(1234);
		list.add(894);
		list.add(6768);
		list.add(234);
		
		Collections.sort(list);
		System.out.println(list);
		int i = Collections.binarySearch(list, 1234);
		System.out.println(i);
		
		Comparator ctr = Collections.reverseOrder();
		Collections.sort(list, ctr);
		System.out.println(list);
		int j = Collections.binarySearch(list, 234, ctr);
		System.out.println(j);	
	}

}
