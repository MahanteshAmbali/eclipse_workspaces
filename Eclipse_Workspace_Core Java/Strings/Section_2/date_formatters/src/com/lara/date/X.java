package com.lara.date;

import java.text.NumberFormat;

public class X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberFormat nf1 = NumberFormat.getInstance();
		double num = 24567.23423;
		
		System.out.println(num);
		System.out.println(nf1.format(num));		
	}

}
