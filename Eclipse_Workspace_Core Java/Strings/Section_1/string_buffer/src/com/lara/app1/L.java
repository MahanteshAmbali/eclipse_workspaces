package com.lara.app1;

public class L {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		sb.append("abcdefghij");
		
		System.out.println(sb);
		
		sb.delete(-1, 50);
		
		System.out.println(sb);
	}

}
