package com.lara.linklist;

import java.util.LinkedList;

class Stack{

	LinkedList list= new LinkedList();
	
	public void add(Object string) {
		// TODO Auto-generated method stub
		list.add(string);
	}

	public Object processElement() {
		// TODO Auto-generated method stub
		return list.removeLast();
	}
	
}

public class M5 {

	public static void main(String[] args) {
	
		Stack s1 = new Stack();
		s1.add("sagar");
		s1.add("dell");
		s1.add("lenovo");
		
		System.out.println("Done");
		
		Object o1 = s1.processElement();
		Object o2 = s1.processElement();
		Object o3 = s1.processElement();
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}

}
