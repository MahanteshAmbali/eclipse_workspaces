package com.lara.app1;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("abc");
		sb.append("abc");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.trimToSize();
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}

}
