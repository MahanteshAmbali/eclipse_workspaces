package com.lara;

public class Employee
{
	private int id;
	private String FirstName;	//firstName
	private String LastName;	// lastName		
	private String Address;
	private double salary;
	
	public int getid()
	{
		return id;
	}
	
	public void setid(int id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return FirstName;
		
	}
	public void setFirstName(String FirstName)
	{
		this.FirstName= FirstName;
		
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
