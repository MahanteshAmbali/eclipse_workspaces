package com.lara.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class J implements Comparable{
	
	int i;
	J(int i){
		this.i = i;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class M28 {

	public static void main(String[] args) {

		TreeSet trSet = new TreeSet();
		trSet.add(new J(10));
		trSet.add(new J(123));
		trSet.add(new J(12));
		trSet.add(new J(234));		
		trSet.add(new J(9485));

	}

}
