package com.lara.date;

import java.util.Calendar;
import java.util.Date;

public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		Date d1 = cal1.getTime();
		System.out.println(d1);
		
		cal1.add(Calendar.MONTH, 10);
		cal2.roll(Calendar.MONTH, 10);
		Date d3 = cal2.getTime();
		
		cal2.clear();
		Date d4 = cal2.getTime();
		Date d2 = cal1.getTime();
		
		Calendar cal3 = Calendar.getInstance();
		
		cal3.clear();
		Date d5 = cal3.getTime();
		
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
	}

}
