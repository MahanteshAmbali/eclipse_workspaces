package com.lara.date;

import java.util.Calendar;
import java.util.Date;

public class O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		Date d1 = cal.getTime();
		System.out.println(d1);
		
		cal.add(Calendar.DATE, 3);
		d1 = cal.getTime();
		
		//Date d2 = cal.getTime();
		
		System.out.println(d1);
	}

}
