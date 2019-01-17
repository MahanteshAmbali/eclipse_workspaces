package com.lara.hashMap;

import java.util.TreeMap;

class D implements Comparable{
	int i;
	
	D(int i){
		this.i = i;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return this.i - ((D)arg0).i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.toString(i).hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return this.i == ((D)arg0).i;
	}
}

public class M45 {

	public static void main(String[] args) {

		TreeMap tMap = new TreeMap();
		tMap.put(new D(90), "Dell");
		tMap.put(new D(90), "Lenovo");
		tMap.put(new D(29), "Sony");
		tMap.put(new D(29), "sagar");
		
		System.out.println(tMap);
	}

}
