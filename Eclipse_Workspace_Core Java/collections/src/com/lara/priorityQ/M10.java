package com.lara.priorityQ;

import java.util.PriorityQueue;

public class M10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue();
		pq.add(12);
		pq.add(1234);
		pq.add(3);
		
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add(12);
		pq1.add(9903);
		pq1.add(3);
		
		pq1.add(pq);
		System.out.println(pq1);
		System.out.println("Done");
	}

}
