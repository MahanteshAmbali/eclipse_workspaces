package com.lara.hashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class C{
	int i, j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	static class D implements Comparator{

		@Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			C c1 = (C)arg0;
			C c2 = (C)arg1;
			
			return c1.i - c2.i;
		}
	}
	
	static class E implements Comparator{
		
		@Override
		public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
			C c1 = (C)arg0;
			C c2 = (C)arg1;
			
			return c1.j - c2.j;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i+", j: "+j;
	}
	
}

public class M44{
	
	public static void main(String[] args) {
		
		TreeMap hMap = new TreeMap(new C.D());
		hMap.put(new C(2,1), 324);
		hMap.put(new C(2,1), 324);
		hMap.put(new C(2,1), 324);
		hMap.put(new C(2,1), 324);
		
		TreeMap tMap = new TreeMap(new C.E());
		tMap.put(new C(2,34), 324);
		tMap.put(new C(2,45), 324);
		tMap.put(new C(2,324), 324);
		tMap.put(new C(2,12), 324);
		
		System.out.println(tMap);
	}
}
