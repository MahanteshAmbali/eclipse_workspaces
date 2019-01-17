package com.lara.hashSet;

import java.util.HashSet;

class F{
	int i, j;
	
	F(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i:"+i+", j: "+j;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		
		int hash = s1.hashCode() + s2.hashCode();
		
		return hash;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		if((F)arg0 != null && arg0 instanceof F){
			return ((this.i == ((F)arg0).i) && (this.j == ((F)arg0).j));
		}
		return false;
	}
}
public class M20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		
		set.add(new F(12, 34));
		set.add(new F(12, 34));

		set.add(new F(3, 82));
		set.add(new F(3, 82));
		
		set.add(new F(90, 0));
		set.add(new F(90, 0));
		
		set.add(new F(1234, 0));
		set.add(new F(90, 23124));
		
		System.out.println(set);
	}
}
