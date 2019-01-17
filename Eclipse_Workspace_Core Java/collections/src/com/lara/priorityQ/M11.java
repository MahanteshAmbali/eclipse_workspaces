package com.lara.priorityQ;

import java.util.PriorityQueue;

class A1 implements Comparable{
	int i;
	String s;
	
	A1(int i){
		this.i = i;
	}
	
	A1(String s1){
		this.s = s1;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO A1uto-generated method stub
		A1 a1 = (A1)arg0;
		
		return i - a1.i;
	}
	
}

public class M11 {

	public static void main(String[] args) {
		// TODO A1uto-generated method stub

		PriorityQueue pq = new PriorityQueue();
		pq.add(new A1(1000));
		pq.add(new A1(32));
		pq.add(new A1(234));
		pq.add(new A1(3280));
		pq.add(new String("abc"));
		
		System.out.println(pq);
		
	}

}
