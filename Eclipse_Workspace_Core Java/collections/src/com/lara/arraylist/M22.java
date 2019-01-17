package com.lara.arraylist;

import java.util.ArrayList;

class B{
	int i;
	
	B(int i){
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}

public class M22 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(123);
		list.add("adfsf");
		list.add(new B(324));
		list.add(new B(11));
		System.out.println(list);
	}

}
