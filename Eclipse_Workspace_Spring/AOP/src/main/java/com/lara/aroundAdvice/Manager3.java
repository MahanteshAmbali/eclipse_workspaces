package com.lara.aroundAdvice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Book book1 = (Book) context.getBean("advicedH3");
		
		String msg = "hello World.!";
		
		msg = book1.bookName("Core Java by Ramesh Reddy");
		
		System.out.println(msg);
	}

}
