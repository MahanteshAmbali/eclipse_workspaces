package com.lara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLis extends ArrayList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add(845.9);
		list.add(34.4);
		list.add(6784.2);
		list.add(34);
		Collections.sort(list);
		System.out.println(list);
	}

}
