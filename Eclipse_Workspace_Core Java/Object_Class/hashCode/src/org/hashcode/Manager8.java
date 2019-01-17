package org.hashcode;

import java.util.HashSet;

class I{
	
	int i, j;
	
	public I(int i, int j){
		
		this.i = i;
		this.j = j;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("Hash Code");
		int hash = 0;
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		
		hash = hash + s1.hashCode() + s2.hashCode();
		return hash;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		System.out.println("Equals");
		I i1 = (I)arg0;
		
		if((i1 instanceof I) && (this.i == i1.i) && (this.j == j))
			return true;
		
		return false;
	}
	
}

public class Manager8 {

	public static void main(String[] args) {
	
		HashSet set = new HashSet();
		set.add(new I(10,20));
		System.out.println("--------");
		
		set.add(new I(10,20));
		System.out.println("--------");

		set.add(new I(20,30));
		System.out.println("--------");
		
		set.add(new I(50,10));
		System.out.println("--------");
		
		set.add(new I(50,10));
		System.out.println("--------");
		
		System.out.println(set.size());
	}
}
