package com.lara.hashSet;

import java.util.HashSet;

class E{
	
	int i;
	private String s1;
	E(int i){
		this.i = i;
	}
	
	
	public E(String string) {
		// TODO Auto-generated constructor stub
		this.s1 = string;
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
		E e1 =(E)arg0;
		return i == e1.i;
	}
}
public class M19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add(new E(90));
		set.add(new E(90));
		set.add(new E(9));
		set.add(new E(9));
		set.add(new E("abc"));
		set.add(new E("abc"));

		System.out.println(set.size());
		System.out.println(set);
	}

}
