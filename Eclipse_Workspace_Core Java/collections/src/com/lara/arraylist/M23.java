package com.lara.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class C{
	
	int i;
	
	C(int i){
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}

public class M23 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new C(132));
		list.add(new C(23));
		list.add(new C(546));
		list.add(new C(3245));

		Collections.sort(list);
		System.out.println(list);
	}

}
