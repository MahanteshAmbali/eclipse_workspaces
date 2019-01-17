package com.lara.priorityQ;

import java.util.PriorityQueue;

public class M8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue queue = new PriorityQueue();
		
		queue.add(2340);
		queue.add(542350);
		queue.add(932);
		queue.add(134);
		queue.add(482);
		queue.add(90);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);

		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
	}

}
