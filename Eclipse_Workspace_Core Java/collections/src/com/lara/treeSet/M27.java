package com.lara.treeSet;

import java.util.TreeSet;

class I{
	
	int i;
	I(int i){
		this.i = i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}

public class M27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet trSet = new TreeSet();
		trSet.add(new I(10));
		trSet.add(new I(123));
		trSet.add(new I(12));
		trSet.add(new I(234));		
		trSet.add(new I(9485));
	}

}
