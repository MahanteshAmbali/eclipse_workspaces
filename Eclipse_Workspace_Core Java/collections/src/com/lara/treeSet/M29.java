package com.lara.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class L{
	int i, j;
	
	L(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	static class A implements Comparator{

		@Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			L l1 = (L)arg0;
			L l2 = (L)arg1;
			
			return l1.i - l2.i;
		}
		
	}
	
	static class B implements Comparator{

		@Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			L l1 = (L)arg0;
			L l2 = (L)arg1;
			
			return l1.j - l2.j;
		}
		
	}
}
public class M29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet trSet = new TreeSet(new L.A());
		trSet.add(new L(10, 72));
		trSet.add(new L(123, 34));
		trSet.add(new L(12, 83));
		trSet.add(new L(234, 237));		
		trSet.add(new L(9485,27));

		TreeSet trSet1 = new TreeSet(new L.B());
		trSet1.add(new L(10, 72));
		trSet1.add(new L(123, 34));
		trSet1.add(new L(12, 83));
		trSet1.add(new L(234, 237));		
		trSet1.add(new L(9485,27));
	}
}
