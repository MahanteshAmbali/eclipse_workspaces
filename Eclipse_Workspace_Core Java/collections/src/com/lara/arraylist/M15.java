package com.lara.arraylist;

import java.util.ArrayList;

public class M15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);													
		list.add(6768);
		list.add(234);
		
		System.out.println(list);
		list.set(0, "anc");
		System.out.println(list);
		
	}

}
