package com.lara.hashSet;

import java.util.HashSet;

class G{
	int i, j;
	
	G(int i, int j){
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
		return (((G)arg0) instanceof G) && (i == ((G)arg0).i && j == ((G)arg0).j);
	}
}
public class M21 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add(new G(123, 834));
		set.add(new G(239, 83));
		set.add(new G(244, 890));
		
		set.add(new G(123, 834));
		set.add(new G(239, 83));
		set.add(new G(244, 890));
		
		System.out.println(set);
	}

}
