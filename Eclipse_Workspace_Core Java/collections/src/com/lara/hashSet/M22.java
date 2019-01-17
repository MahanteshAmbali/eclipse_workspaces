package com.lara.hashSet;

import java.util.HashSet;

class I{
	int i, j;
	
	I(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = 0;
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		
		hash = s1.hashCode() + s2.hashCode();
		return hash;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", j: "+j;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return (((I)arg0) instanceof I) && (i == ((I)arg0).i && j == ((I)arg0).j);
	}
}
public class M22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add(new I(123, 834));
		set.add(new I(239, 83));
		set.add(new I(244, 890));
		
		set.add(new I(123, 834));
		set.add(new I(239, 83));
		set.add(new I(244, 890));
		
		System.out.println(set);
	}

}
