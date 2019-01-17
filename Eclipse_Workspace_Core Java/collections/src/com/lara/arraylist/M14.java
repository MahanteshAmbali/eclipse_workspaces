package com.lara.arraylist;

import java.util.ArrayList;

public class M14 extends ArrayList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		ArrayList list = new ArrayList();
		list.add(234);
		list.add(1234);
		list.add(894);													//WILL NOT WORK IF USING ARRAYLIST OBJECT ONLY
		list.add(6768);
		list.add(234);
		
		System.out.println(list);
		list.removeRange(0,2);
		System.out.println(list);*/
		
		
		M14 list = new M14();
		list.add(234);
		list.add(1234);
		list.add(894);													//WILL NOT WORK IF USING ARRAYLIST OBJECT ONLY
		list.add(6768);
		list.add(234);
		
		System.out.println(list);
		list.removeRange(0, 2);
		System.out.println(list);
	}

}
