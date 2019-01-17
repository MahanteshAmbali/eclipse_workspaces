package com.lara.app1;

public class I {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(500);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("-----------");
		
		sb.append("9876543210");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("-----------");
		
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("-----------");
		
	}

}
