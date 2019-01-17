package com.lara;

import java.util.ArrayList;
import java.util.List;

public class RemoveDupsFromArrayList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(40);
		list.add(60);
		list.add(70);
		list.add(50);
		list.add(80);
		
		int size = list.size()-1;
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(list.get(i) == list.get(j)){
					list.remove(j);
				}
			}
		}
		
		System.out.println(list);
	}

}
