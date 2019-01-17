package com.lara.date;

import java.text.NumberFormat;
import java.text.ParseException;

public class Z2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 8898989.8989389;
		NumberFormat nf1 = NumberFormat.getInstance();
		String s1 = nf1.format(num);
		
		System.out.println(num);
		System.out.println(s1);
		try {
			Number num1 = nf1.parse(s1);
			System.out.println(num1);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
