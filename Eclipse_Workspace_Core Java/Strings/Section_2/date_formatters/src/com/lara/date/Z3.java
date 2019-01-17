package com.lara.date;

import java.text.NumberFormat;
import java.util.Locale;

public class Z3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 989898.768878;
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(num);
		
		String s1 = nf1.format(num);
		System.out.println(s1);
	}

}
