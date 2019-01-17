package com.lara.date;

import java.text.DateFormat;
import java.util.Date;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1 = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		
		String s1 = df.format(d1);
		
		System.out.println(s1);
	}

}
