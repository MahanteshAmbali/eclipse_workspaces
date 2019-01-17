package com.lara.date;

import java.util.Calendar;
import java.util.Date;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		Date d1 = cal.getTime();					// getTime() of calendar returns Date object 
													// getTime() of Date returns long number
		System.out.println(d1);
	}

}
