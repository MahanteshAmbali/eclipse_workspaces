package com.lara.linklist;

import java.util.LinkedList;

public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add("abc");
		list.add(90);
		list.add(350);
		
		System.out.println(list);
		Object o1 = list.poll();
		Object o2 = list.pop();
		Object o3 = list.remove();
		
		System.out.println(o1+", "+o2+", "+o3);
		System.out.println(list);
	}

}
