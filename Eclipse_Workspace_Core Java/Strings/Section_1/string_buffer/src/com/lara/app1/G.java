package com.lara.app1;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("12345678900987654321");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println(sb.charAt(sb.length()-1));
		
	}

}
