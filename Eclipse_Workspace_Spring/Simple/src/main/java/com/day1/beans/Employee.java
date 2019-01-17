package com.day1.beans;

import java.io.IOException;

public class Employee {

	public String firstName;
	public String lastName;
	
	public Employee() {
		
	}
	
	public Employee(String fName, String lName) throws Exception{
		this.firstName = fName;
		this.lastName = lName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
