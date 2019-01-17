package com.lara.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private String firstName;
	private Book book;
	
	@Autowired
	public Employee(String fName, Book book1) {
	
		this.firstName = fName;
		this.book = book1;
	}

	public String getFirstName() {
		return firstName;
	}

	public Book getBook() {
		return book;
	}
}
