package com.lara.linklist;

import java.util.LinkedList;

class Queue{
	
	LinkedList list = new LinkedList();
	
	public void add(Object o){
		list.add(o);
	}
	
	public Object remove(){
		return list.removeFirst();
	}
}

public class M4 {

	public static void main(String[] args) {

		Queue q1 = new Queue();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println("done");
		Object o1 = q1.remove();
		Object o2 = q1.remove();
		Object o3 = q1.remove();
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}
}
