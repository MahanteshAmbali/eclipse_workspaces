package com.lara.aroundAdvice;

public class BookImpl implements Book{
	
	public String bookName(String s1) {
		
		System.out.println("From BookName()");
		return "Book Name is: "+s1;
	}
}
