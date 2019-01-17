package org.generics;

class D<T>{
	String s1;
	T t1;
	@Override
	public String toString() {
		return "D [s1=" + s1 + ", t1=" + t1 + "]";
	}
	
	
}

public class Manager3 {

	public static void main(String[] args) {

		D<Integer> d1 = new D<Integer>();
		d1.s1 = "abc";
		d1.t1 = 39;
		
		System.out.println(d1);
	}

}
