package com.lara.date;

import java.text.NumberFormat;
import java.util.Locale;

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getInstance(Locale.FRANCE);
		double num = 123324.23443589;
		
		System.out.println(num);
		System.out.println(nf1.format(num));
		System.out.println(nf2.format(num));
	}

}
