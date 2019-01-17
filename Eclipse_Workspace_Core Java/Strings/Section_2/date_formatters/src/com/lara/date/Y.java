package com.lara.date;

import java.text.NumberFormat;
import java.util.Locale;

public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num = 944840.328998;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
		System.out.println(num);
		System.out.println(nf.format(num));
	}

}
