package com.lara.date;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 0);
		
		Date d1 = cal.getTime();
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(df1.format(d1));
		System.out.println(df2.format(d1));
		System.out.println(df3.format(d1));
		System.out.println(df4.format(d1));
	}
}
