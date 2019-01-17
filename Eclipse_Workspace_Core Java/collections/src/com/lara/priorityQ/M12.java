package com.lara.priorityQ;

import java.util.Comparator;
import java.util.PriorityQueue;

class B {
	
	int i, j;

	
	B(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", j: "+j;
	}
}

class C implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		B b1 = (B)arg0;
		B b2 = (B)arg1;
		
		return b1.i - b2.i;
	}
}

class D implements Comparator{
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		B b1 = (B)arg0;
		B b2 = (B)arg1;
		
		return b1.j - b2.j;
	}
}

public class M12 {

	public static void main(String[] args) {

		/*PriorityQueue pq1 = new PriorityQueue(10, new C());
		pq1.add(new B(1, 0));
		pq1.add(new B(34, 3));
		pq1.add(new B(776, 3));
		pq1.add(new B(234,0));
		pq1.add(new B(12,23));
		pq1.add(new B(10,23));
		System.out.println(pq1);
		
		System.out.println("--Sorting based on i value--");
		System.out.println(pq1.poll());
		System.out.println(pq1);
		
		System.out.println(pq1.poll());
		System.out.println(pq1);
		
		System.out.println(pq1.poll());
		System.out.println(pq1);
		
		System.out.println(pq1.poll());
		System.out.println(pq1);*/
		
		PriorityQueue pq2 = new PriorityQueue(10, new D());
		pq2.add(new B(1, 0));
		pq2.add(new B(12,23));
		pq2.add(new B(10,23));
		pq2.add(new B(34, 3));
		pq2.add(new B(776, 3));
		pq2.add(new B(234,0));
		
		System.out.println(pq2);
		System.out.println("--Sorting based on j value--");
		System.out.println(pq2.poll());
		System.out.println(pq2);
		
		System.out.println(pq2.poll());
		System.out.println(pq2);
		
		System.out.println(pq2.poll());
		System.out.println(pq2);
		
		System.out.println(pq2.poll());
		System.out.println(pq2);
	}
}
