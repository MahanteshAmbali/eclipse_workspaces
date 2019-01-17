package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class F{
	
	int i,j;
	
	F(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", j: "+j;
	}
}

class G implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		F f1 = (F) arg0;
		F f2 = (F) arg1;
		return f1.i - f2.i;
	}	
}

class H implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		F f1 = (F) arg0;
		F f2 = (F) arg1;
		return f1.j - f2.j;
	}
}


public class M26 {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		list.add(new F(132, 23));
		list.add(new F(23, 12));
		list.add(new F(546, 908));
		list.add(new F(3245, 3248));

		System.out.println(list);
		System.out.println("-----------------------------");
		
		Collections.sort(list, new G());
		System.out.println("Sort based on (i): "+list);
		System.out.println("-----------------------------");
		
		Collections.sort(list, new H());
		System.out.println("Sort based on (j): "+list);
		System.out.println("-----------------------------");
	
	}
}
