package com.lara.app2;

public class F {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "abababab";
				  //01234567
		int i = s1.indexOf('b');
		int j = s1.indexOf("a", 3);
		int k = s1.lastIndexOf('b');
		int l = s1.lastIndexOf('a');
		
		System.out.println(i + " ,"+ j + " ,"+ k + " ," + l + " ,");
	}
}
