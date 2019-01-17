package com.lara.arraylist;

import java.util.ArrayList;

class A{
	int i;
	
	A(int i){
		this.i = i;
	}
}

public class M21 {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("adfsf");
		list.add(new A(324));
		list.add(new A(11));
		System.out.println(list);
	}

}
