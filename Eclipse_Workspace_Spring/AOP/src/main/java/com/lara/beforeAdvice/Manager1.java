package com.lara.beforeAdvice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager1 {

	public static void main(String[] args) {
		
		Hello obj1 = (Hello) Util.getObject("advisedH1");
		obj1.sayHello();
	}

}
