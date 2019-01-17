package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class E implements Comparable{
	int i, j;
	
	E(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		E e1 = (E)arg0;
		
		return i - e1.i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", j: "+j;
	}
}

public class M25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add(new E(132, 23));
		list.add(new E(23, 12));
		list.add(new E(546, 908));
		list.add(new E(3245, 3248));

		System.out.println(list);
		Collections.sort(list);
		System.out.println("Sort based on (i): "+list);
	}

}
