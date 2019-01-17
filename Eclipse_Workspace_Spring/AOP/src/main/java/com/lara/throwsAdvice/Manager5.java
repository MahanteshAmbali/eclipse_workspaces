package com.lara.throwsAdvice;

import com.lara.afterAdvice.Util;

public class Manager5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = (Person) Util.getObject("advicedH4");
		person1.method1();
		System.out.println("End of Application");
	}

}
