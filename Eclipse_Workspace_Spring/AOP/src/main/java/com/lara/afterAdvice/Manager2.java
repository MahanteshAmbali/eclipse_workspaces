package com.lara.afterAdvice;

import com.lara.beforeAdvice.Util;

public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting greeting1 = (Greeting) Util.getObject("advisedH2");
		String msg = greeting1.sendGreeting("Hello World.!");
		System.out.println(msg);
	}

}
