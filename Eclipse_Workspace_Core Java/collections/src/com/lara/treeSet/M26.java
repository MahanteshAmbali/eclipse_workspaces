package com.lara.treeSet;

import java.util.Collections;
import java.util.TreeSet;

public class M26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet trSet = new TreeSet(Collections.reverseOrder());
		trSet.add(9.9);
		trSet.add(384.2);
		trSet.add(294.49);
		trSet.add(4581.29);
		trSet.add(4581.299);
		
		System.out.println(trSet);
	}

}
