package com.lara.afterAdvice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Util {

	private static ClassPathXmlApplicationContext context = null;
	
	static{
		context = new ClassPathXmlApplicationContext("config.xml");
	}
	
	public static Object getObject(String s1){
		return context.getBean(s1);
	}
}
