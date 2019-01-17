package com.lara.app1;

public class E {

	private int i;

	public static void main(String[] args) {
		
		E e1 = new E();
		e1.i = 40;
		
		StringBuffer sb = new StringBuffer();
		sb.append(true);
		sb.append('a');
		sb.append("abc");
		sb.append(10.56);
		sb.append(20.345);
		sb.append(30);
		sb.append(e1.i);
		sb.append("xyz");
		
		System.out.println(sb.capacity());
		System.out.println(sb);
		
	}
}
