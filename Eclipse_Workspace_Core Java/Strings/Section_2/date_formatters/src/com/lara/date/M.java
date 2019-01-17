package com.lara.date;

import java.util.Calendar;
import java.util.Date;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.MONTH, 0);
		
		Date d1 = cal.getTime();
		
		System.out.println(d1);
	}

}
