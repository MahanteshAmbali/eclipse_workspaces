package com.lara.hashMap;

import java.util.TreeMap;

class A implements Comparable{
	
	int i;
	A(int i){
		this.i = i;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		A a1 = (A) arg0;
		return this.i - a1.i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "i: "+i;
	}
}

public class M43 {

	public static void main(String[] args) {

		TreeMap trMap = new TreeMap();
		trMap.put(new A(19), "hello");
		trMap.put(new A(9), "hello");
//		trMap.put(new A(19), "hello");
//		trMap.put(new A(19), "hello");

		System.out.println(trMap);
	}

}
