package com.lara.hashMap;

import java.util.HashMap;

class P{
	
	int i;
	P(int i){
		this.i = i ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}

class Q{
	int j;
	Q(int j){
		this.j = j;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String s1 = Integer.toString(j);
		return s1.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		Q q1 = (Q)arg0;
		return (q1 instanceof Q) && (this.j == q1.j);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "j: "+j;
	}
	
}

public class M39 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put(90, "e1");
		map.put(90, "e2");
		
		map.put("abc", "v1");
		map.put("abc", "v2");
		
		map.put(new P(19), "hello");
		map.put(new P(19), "world");
		
		map.put(new Q(90), "DEll");
		map.put(new Q(90), "Lenovo");
		
		System.out.println(map);
	}

}
