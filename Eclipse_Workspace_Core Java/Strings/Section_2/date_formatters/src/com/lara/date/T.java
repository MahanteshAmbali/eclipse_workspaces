package com.lara.date;

import java.text.DateFormat;
import java.util.Date;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);		//MEDIUM is by default
		
		String s1 = df.format(d1);
		
		System.out.println(s1);
	}

}
