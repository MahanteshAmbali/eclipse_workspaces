package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class D implements Comparable{

	int i;
	
	D(int i){
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		D d1 = (D)arg0;
		return i - d1.i;
	}
}

public class M24 {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		list.add(new D(132));
		list.add(new D(23));
		list.add(new D(546));
		list.add(new D(3245));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
